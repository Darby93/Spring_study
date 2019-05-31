package controllers;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vo.Empuser;



@Controller
public class JoinController {
		 
		//회원 가입 처리
		@RequestMapping(value="register.htm", method=RequestMethod.POST)
		public String register (Empuser empuser) {

			
			return "redirect:/index.htm";
		}
}
