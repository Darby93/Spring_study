package controllers;

import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import dao.UserDao;
import vo.EmpUser;


@Controller
public class JoinController {
		 
		@Autowired
		private SqlSession session;
		
		//회원 가입 처리
		@RequestMapping("/register.htm")
		public String register (EmpUser empuser) throws Exception {
			
			empuser.getUserid();
			
			UserDao userdao = session.getMapper(UserDao.class);
			
			userdao.insertUser(empuser);
			
			return "redirect:/index.htm";
		}
		
		@RequestMapping("/logout.htm")
		public String logout (HttpServletRequest request) {
			HttpSession session2 = request.getSession();
			session2.invalidate();
			
			return "redirect:/index.htm";
		}
		//로그인 처리
		@RequestMapping("/login.htm")
		public String login (String userid, String password, HttpServletRequest request) {
			HttpSession session2 = request.getSession();

			UserDao userdao = session.getMapper(UserDao.class);
			
			String password2 = userdao.loginEmp(userid);
			
			if(password.equals(password2)) {
				session2.setAttribute("userid", userid);
			}
			
			return "redirect:/index.htm";
		}
		
		
}
