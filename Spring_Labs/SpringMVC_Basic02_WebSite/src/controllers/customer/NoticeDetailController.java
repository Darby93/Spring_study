package controllers.customer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import dao.NoticeDao;
import vo.Notice;

public class NoticeDetailController implements Controller{
	
	public NoticeDetailController() {
		System.out.println("[ NoticeDetailController ]");
	}
	
	private NoticeDao noticedao;
	
//	NoticeDao noticedao = new NoticeDao(); (new  직접 안해!)
	//setter 주입 (xml설정, annotation 설정 둘다 가능)
	
	public void setNoticedao(NoticeDao noticedao) {
		this.noticedao = noticedao;
	}
	
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		String seq = req.getParameter("seq");
		Notice notice = noticedao.getNotice(seq);
		
		ModelAndView mv =  new ModelAndView();
		
		mv.addObject("notice",notice);
		
		mv.setViewName("noticeDetail.jsp");
		
		return mv;
	}

}
