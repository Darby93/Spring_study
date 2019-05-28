package controllers;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("/joinus/")
public class JoinController {
	
	//회원 가입 페이지
	@RequestMapping(value="register.htm", method=RequestMethod.GET)
	public String join() {
		
		return "joinus.register";
	}
	
	//로그인 페이지
	@RequestMapping(value="login.htm", method=RequestMethod.GET)
	public String login () {
		
		return "joinus.login";
	}
	
	
	
}