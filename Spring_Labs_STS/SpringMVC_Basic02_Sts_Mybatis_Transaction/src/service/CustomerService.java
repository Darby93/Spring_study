package service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import dao.NoticeDao;
import vo.Notice;

/*

controller -> service -> DB  작업(Mybatis) -> service -> scontroller

service (DB작업)

*/
@Service
public class CustomerService {

	@Autowired
	private SqlSession session;

	// 글 목록보기
	public List<Notice> handleRequest(@RequestParam(value = "pg", defaultValue = "1") int page,
			@RequestParam(value = "f", defaultValue = "TITLE") String f,
			@RequestParam(value = "q", defaultValue = "%%") String q) throws Exception {

		// DAO 객체 데이터 목록 받아오기
		NoticeDao noticedao = session.getMapper(NoticeDao.class);
		List<Notice> list = noticedao.getNotices(page, f, q);

		return list;
	}

	// 글 상세보기
	public Notice handleRequest(String seq) throws Exception {

		NoticeDao noticedao = session.getMapper(NoticeDao.class);
		Notice notice = noticedao.getNotice(seq);

		return notice;
	}

	// 글 작성하기
	@Transactional //파라미터로 옵션을 주지 않으면 예외가 발생하면 롤백시킴
	public int noticeReg(Notice notice, HttpServletRequest request)
			throws Exception {

		List<CommonsMultipartFile> files = notice.getFiles();
		List<String> filenames = new ArrayList<String>();

		if (files != null && files.size() > 0) {
			for (CommonsMultipartFile multifile : files) {
				String filename = multifile.getOriginalFilename();
				String path = request.getServletContext().getRealPath("/upload");

				String fpath = path + "\\" + filename; // C:\\temp\\a.jpg

				if (!filename.contentEquals("")) { // 실 파일 업로드
					FileOutputStream fs = new FileOutputStream(fpath);
					fs.write(multifile.getBytes());
					fs.close();
				}

				filenames.add(filename); // DB insert 파일명

			}
		}
		
		int result = 1;
		notice.setFileSrc(filenames.get(0));
		notice.setFileSrc2(filenames.get(1));
		NoticeDao noticedao = session.getMapper(NoticeDao.class);
		
		//int result = noticedao.insert(notice); 기존방법
		
		//트랜잭션 적용하기
		//@Transactional 파라미터로 옵션을 주지 않으면 예외가 발생하면 롤백시킴
		
		//alter table member 
		//add constraint ck_member_hit check(point < 3);
		
		try {
			noticedao.insert(notice);
			noticedao.insertOfMemberPoint("bituser");
		} catch (Exception e) {
			System.out.println("trans 예외 발생 : " + e.getMessage());
			throw e; //시점 @Transactional 자동롤백
		}
		
		return 1;

	}

	// 글 삭제하기
	public int deleteNotice(String seq) throws ClassNotFoundException, SQLException {
		NoticeDao noticedao = session.getMapper(NoticeDao.class);
		int result = noticedao.delete(seq);

		return result;
	}

	// 글수정 화면
	public Notice noticeEdit(String seq) throws ClassNotFoundException, SQLException {
		NoticeDao noticedao = session.getMapper(NoticeDao.class);
		Notice notice = noticedao.getNotice(seq);

		return notice;
	}

	// 글수정 처리
	public String noticeEdit(Notice notice, HttpServletRequest request)
			throws IOException, ClassNotFoundException, SQLException {

		List<CommonsMultipartFile> files = notice.getFiles();
		List<String> filenames = new ArrayList<String>();

		if (files != null && files.size() > 0) {
			for (CommonsMultipartFile multifile : files) {
				String filename = multifile.getOriginalFilename();
				String path = request.getServletContext().getRealPath("/upload");

				String fpath = path + "\\" + filename; // C:\\temp\\a.jpg

				if (!filename.contentEquals("")) { // 실 파일 업로드
					FileOutputStream fs = new FileOutputStream(fpath);
					fs.write(multifile.getBytes());
					fs.close();
				}

				filenames.add(filename); // DB insert 파일명

			}
		}

		// 실 DB insert
		notice.setFileSrc(filenames.get(0));
		notice.setFileSrc2(filenames.get(1));
		NoticeDao noticedao = session.getMapper(NoticeDao.class);
		noticedao.update(notice);

		return notice.getSeq();

	}

	 //파일 다운로드
	 public void download(String p, String f, HttpServletRequest request, HttpServletResponse response) throws IOException {
	  
	  String fname = new String(f.getBytes("euc-kr"), "8859_1");
	  response.setHeader("Content-Disposition", "attachment;filename=" + fname + ";");
	  
	  String fullpath = request.getServletContext().getRealPath("/customer/" + p + "/" + f);
	  System.out.println(fullpath);
	  FileInputStream fin = new FileInputStream(fullpath);
	  
	  ServletOutputStream sout = response.getOutputStream();
	  byte[] buf = new byte[1024]; // 전체를 다읽지 않고 1204byte씩 읽어서
	  int size = 0;
	  while ((size = fin.read(buf, 0, buf.length)) != -1) 
	  { 
	   sout.write(buf, 0, size); 
	  }
	  fin.close();
	  sout.close();
	 
	}
}
