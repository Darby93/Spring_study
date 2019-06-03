package controllers.customer;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import service.CustomerService;
import vo.Notice;

//게시판 목록 보기(업무)
//Service >> Dao 객체 생성 >> Dao 함수 호출 >> 결과받기
//NoticeController 와 NoticeDao 관계
//NoticeController 는   NoticeDao에 의존한다

@Controller
@RequestMapping("/customer/")
public class NoticeController {

	public NoticeController() {
		System.out.println("[ NoticeController ]");
	}

	/*
	 * mybatis 사용해서 사라짐
	 * 
	 * @Autowired private NoticeDao noticedao; // NoticeDao noticedao = new
	 * NoticeDao(); (new 직접 안해!) //setter 주입 (xml설정, annotation 설정 둘다 가능)
	 * 
	 * 
	 * //글 목록보기 //public ModelAndView handleRequest(~~~~~~, Model model) //
	 * model.addAttribute (view 단 페이지에 자동 forward (list 이름으로)
	 */

	@Autowired
	private CustomerService customerservice;

	// 컨트롤러가 서비스 객체에 의존 !!

	@RequestMapping("notice.htm")
	public ModelAndView handleRequest(@RequestParam(value = "pg", defaultValue = "1") int page,
			@RequestParam(value = "f", defaultValue = "TITLE") String f,
			@RequestParam(value = "q", defaultValue = "%%") String q) throws Exception {

		List<Notice> list = customerservice.handleRequest(page, f, q);

		ModelAndView mv = new ModelAndView();

		mv.addObject("list", list);
		mv.setViewName("customer.notice");

		return mv;
	}

	@RequestMapping("noticeDetail.htm")
	public ModelAndView handleRequest(String seq) throws Exception {

		Notice notice = customerservice.handleRequest(seq);

		ModelAndView mv = new ModelAndView();

		mv.addObject("notice", notice);

		mv.setViewName("customer.noticeDetail");

		return mv;
	}

	// 글쓰기 화면
	@RequestMapping(value = "noticeReg.htm", method = RequestMethod.GET)
	public String noticeReg() {
		System.out.println("image.jsp forward");

		return "customer.noticeReg";
	}

	// 글쓰기 처리
	@RequestMapping(value = "noticeReg.htm", method = RequestMethod.POST)
	public String noticeReg(Notice notice, HttpServletRequest request)
			throws Exception {
		String url = "redirect:notice.htm";
		
		try {
			int result = customerservice.noticeReg(notice, request);
		} catch (Exception e) {
			
		}
		
		
		

//		if (result != 0) {
//			return url;
//		} else {
//			return url;
//		}

		return url;
	}

	@RequestMapping("noticeDel.htm")
	public String deleteNotice(String seq) throws ClassNotFoundException, SQLException {

		customerservice.deleteNotice(seq);

		return "redirect:notice.htm";
	}

	@RequestMapping(value = "noticeEdit.htm", method = RequestMethod.GET)
	public String noticeEdit(String seq, Model model) throws ClassNotFoundException, SQLException {

		Notice notice = customerservice.noticeEdit(seq);

		model.addAttribute("notice", notice);

		return "customer.noticeEdit";
	}

	@RequestMapping(value = "noticeEdit.htm", method = RequestMethod.POST)
	public String noticeEdit(Notice notice, HttpServletRequest request, Model model)
			throws IOException, ClassNotFoundException, SQLException {

		String result = customerservice.noticeEdit(notice, request);

		return "redirect:noticeDetail.htm?seq=" + result;

	}
	
	
	 //파일 다운로드
	@RequestMapping("download.htm")
	 public void download(String p, String f, HttpServletRequest request, HttpServletResponse response) throws IOException {
		 
		 customerservice.download(p, f, request, response);
	 }
	
}
