package controllers.customer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import dao.NoticeDao;
import vo.Notice;

//게시판 목록 보기(업무)
//Service >> Dao 객체 생성 >> Dao 함수 호출 >> 결과받기
//NoticeController 와 NoticeDao 관계
//NoticeController 는   NoticeDao에 의존한다


@Controller
@RequestMapping("/customer/")
public class NoticeController{
	
	public NoticeController() {
		System.out.println("[ NoticeController ]");
	}
	
	@Autowired
	private NoticeDao noticedao;
//	NoticeDao noticedao = new NoticeDao(); (new  직접 안해!)
	//setter 주입 (xml설정, annotation 설정 둘다 가능)

	
	//글 목록보기 
	//public ModelAndView handleRequest(~~~~~~, Model model)
	// model.addAttribute (view 단 페이지에 자동 forward (list 이름으로)
	
	
	
	
	@RequestMapping("notice.htm")
	public ModelAndView handleRequest(@RequestParam(value="pg", defaultValue="1") int page,
										@RequestParam(value="f", defaultValue="TITLE") String f,
										@RequestParam(value="q", defaultValue="%%") String q) throws Exception {
		
		
		//DAO 객체 데이터 목록 받아오기
		List<Notice> list = noticedao.getNotices(page, f, q);
		
		//SpringMVC (ModeAndView 객체) >> 기존 request.setAttribute("list",list);
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("list",list);
		mv.setViewName("notice.jsp");
		
		return  mv;
	}
	
	
	@RequestMapping("noticeDetail.htm")
	public ModelAndView handleRequest(String seq) throws Exception {
		
		Notice notice = noticedao.getNotice(seq);
		
		ModelAndView mv =  new ModelAndView();
		
		mv.addObject("notice",notice);
		
		mv.setViewName("noticeDetail.jsp");
		
		return mv;
	}
	
	
	@RequestMapping(value="noticeReg.htm", method=RequestMethod.GET)
	public String noticeReg() {
		System.out.println("image.jsp forward");
		
		return "noticeReg.jsp";
	}
	
	
	@RequestMapping(value="noticeReg.htm", method=RequestMethod.POST)
	public String noticeReg(Notice notice, HttpServletRequest request) throws IOException, ClassNotFoundException, SQLException {

		//private List<CommonsMultipartFile> files;
		//files[0] >> a.jpg
		//files[1] >> b.jpg
		
		List<CommonsMultipartFile> files = notice.getFiles();
		List<String> filenames = new ArrayList<String>();
		
		if(files != null && files.size() > 0) {
			for(CommonsMultipartFile multifile : files) {
				String filename = multifile.getOriginalFilename();
				String path = request.getServletContext().getRealPath("/upload");
				
				String fpath = path + "\\" + filename; //C:\\temp\\a.jpg
				
				if(!filename.contentEquals("")) { //실 파일 업로드
					FileOutputStream fs = new FileOutputStream(fpath);
					fs.write(multifile.getBytes());
					fs.close();
				}
				
				filenames.add(filename); //DB insert 파일명 
				
			}
		}

		//실 DB insert
		notice.setFileSrc(filenames.get(0));
		notice.setFileSrc2(filenames.get(1));
		
		noticedao.insert(notice);
		
		return "redirect:notice.htm";
		
		//servlet
		//클라이언트 페이지 재 요청 (F5, 주소 창에서 Enter)
		//location.href
		//response.sendredirect
		
		//spirng   =>  redirect:notice.htm
		
	}
	
	@RequestMapping("noticeDel.htm")
	public String deleteNotice(String seq) throws ClassNotFoundException, SQLException {
		
		noticedao.delete(seq);
		
		return "redirect:notice.htm";
	}
	
	
	//글 수정하기 
	//notice = noticedao.getNotice(seq)
	//parameter (Model 객체 사용)
	
	// 글 수정하기 (DB Update) : POST
	//파일 업로드 처리 (insert 동일)
	//처리(update) -> notice Detail페이지 리다이렉트
	
	@RequestMapping(value="noticeEdit.htm", method=RequestMethod.GET)
	public String noticeEdit(String seq, Model model) throws ClassNotFoundException, SQLException {
		
		Notice notice = noticedao.getNotice(seq);
		
		model.addAttribute("notice", notice);
		
		return "noticeEdit.jsp";
	}
	
	@RequestMapping(value="noticeEdit.htm", method=RequestMethod.POST)
	public String noticeEdit(Notice notice, HttpServletRequest request, Model model) throws IOException, ClassNotFoundException, SQLException {

		//private List<CommonsMultipartFile> files;
				//files[0] >> a.jpg
				//files[1] >> b.jpg
				
				List<CommonsMultipartFile> files = notice.getFiles();
				List<String> filenames = new ArrayList<String>();
				
				if(files != null && files.size() > 0) {
					for(CommonsMultipartFile multifile : files) {
						String filename = multifile.getOriginalFilename();
						String path = request.getServletContext().getRealPath("/upload");
						
						String fpath = path + "\\" + filename; //C:\\temp\\a.jpg
						
						if(!filename.contentEquals("")) { //실 파일 업로드
							FileOutputStream fs = new FileOutputStream(fpath);
							fs.write(multifile.getBytes());
							fs.close();
						}
						
						filenames.add(filename); //DB insert 파일명 
						
					}
				}

				//실 DB insert
				notice.setFileSrc(filenames.get(0));
				notice.setFileSrc2(filenames.get(1));
		
		noticedao.update(notice);
		
		
		return "redirect:noticeDetail.htm?seq=" + notice.getSeq();

	}

}
