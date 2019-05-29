package controllers.customer;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dao.MemberDao;
import vo.Member;

@Controller
@RequestMapping("/joinus/")
public class JoinController {
	
	private MemberDao memberDao;
	
	@Autowired
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	
	
	//회원 가입 페이지
	@RequestMapping(value="join.htm", method=RequestMethod.GET)
	public String join() {
		//return "join.jsp";
		
		return "joinus.join"; // <definition name=" *.*
	}
	 
	//회원 가입 처리
	@RequestMapping(value="join.htm", method=RequestMethod.POST)
	public String join (Member member) {
		try {
			memberDao.insert(member);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "redirect:/index.htm";
	}
	
	//로그인 페이지
	@RequestMapping(value="login.htm", method=RequestMethod.GET)
	public String login () {
		
		return "joinus.login";
	}
	
	
	
}