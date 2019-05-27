package kr.or.bit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

//기존  servlet 과 동일한 역할 >> 요청이 오면  doGet,  doPost(doProcess) >>>>> handleRequest

public class HelloController implements Controller{
	
	
	public HelloController() {
		System.out.println("HelloController 객체 생성 ^^");
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("HelloController 요청 실행 : handleRequest 함수 실행");
		//업무 수행 (게시판 목록 보기 , 글쓰기 .....)
		ModelAndView mav = new ModelAndView(); //데이터를 담고 뷰를 지정 할 수 있따
		
		mav.addObject("name", "hong"); //request.setAttribute
		mav.setViewName("Hello"); //view 별도 구성    
									//RESOLVER 안쓰고 바로 경로 써서 사용할 수도 있다 /WEB-INF/view/Hello.jsp
		
		return mav;
	}

}
