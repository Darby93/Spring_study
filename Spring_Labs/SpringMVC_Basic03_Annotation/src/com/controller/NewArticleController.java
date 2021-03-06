package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.NewArticleCommand;
import com.service.ArticleService;


/*
클라이언트 요청
1. 화면주세요 (글쓰기 화면) write.do
2. 처리해주세요 (글쓰기 처리) writeok.do

/article/newArticle.do (GET 방식, POST 방식) >> 요청 method(GET), method(POST)
하나의 요청 : 화면, 처리 제어

System.out.println("GET 방식에 대한 요청");
		return "article/newArticleForm";
		
		//ViewResolver 에 의해서
		// /WEB-INF/views/article/newArticleForm.jsp
		 * 

		 
NewArticleCommand article = new NewArticleCommand();
		
		article.setParentId(Integer.parseInt(req.getParameter("parentId")));
		article.setTitle(req.getParameter("title"));
		article.setContent(req.getParameter("content"));
		

		articleservice.writeArticle(article);
		
		
		System.out.println("POST 방식에 대한 요청");
		return "article/newArticleSubmitted";
*/



/*
2. parameter DTO 타입을 명시
public String submit (NewArticleCommand command)
동작원리 JPS(Usebean Action 태그 : setProperty)
input name ="이름" >> dto 객체 memberfield 같다면 ... setter

>>submit (NewArticleCommand command)
  DTO타입의 memberfield 명과 parameter 이름이 같다면
  1. 자동으로 DTO 객체가 생성 : NewArticleCommand command = new NewArticleCommand()
  2. 넘어온 parameter 값을 setter 통해서 자동으로 주입
  1.1 NewArticleCommand 객체 IOC 컨테이너 안에서 생성 id="newArticleCommand" 자동생성
  
    원칙 :  ModelaAndView mv = new ModelAndView()
    	mv.addObject("newArticleCommand", command);
    	return mv
    	
  1.2 위 원칙이  없어도  view 페이지에 DTO객체 자동으로  forword (KEY POINT : newArticleCommand) 
  
  다시한번 정리하면
  1. submit(NewArticleCommand command)
  >> 자동 객체 생성, 주입, 객체변수명이 자동(key) : newArticleCommand
  >> forword view page 까지 전달
  
  2. 객체의 이름이 자동으로 생성되는 것이 싫어요
  	 submit(@ModelAttribute("Articledata") NewArticleCommand command
  	 >> 자동으로 생성되는 객체 변수명이 Articledata로 강제된다
  
  3. Model.addAttribute("Articledata", new NewArticleCommand)
*/


@Controller
@RequestMapping("/article/newArticle.do") //method GET, POST 구분
public class NewArticleController {
	
	// NewArticleController 와 writeArticle
	private ArticleService articleservice;
	
	@Autowired
	public void setArticleservice(ArticleService articleservice) {
		this.articleservice = articleservice;
	}


	//GET 방식 요청 (사용자 화면단 제공)
	@RequestMapping(method = RequestMethod.GET)
	public String form () {
		System.out.println("GET 방식에 대한 요청");
		return "article/newArticleForm";
		
		//ViewResolver 에 의해서
		// /WEB-INF/views/article/newArticleForm.jsp
	}
	
	
	/*
	1. 전통적으로 사용되는 Client 요청 데이터 받는 방법
		(spring 더 이상 사용하지 않아요!)
		
		public String submit(HttpServletRequest req)
		req.getParameter("title", ? )
	
	*/
	
	
	
	//(@ModelAttribute("Articledata")
	//POST 방식 요청(글쓰기 처리)
	@RequestMapping(method = RequestMethod.POST)
	public String submit(NewArticleCommand command) {
		
		articleservice.writeArticle(command);
		
		return "article/newArticleSubmitted";
	}
}
