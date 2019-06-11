package controllers;

import org.apache.ibatis.session.SqlSession; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import vo.SampleVO;
import dao.UserDao;

@RestController
public class AjaxController {
	
	@Autowired
	private SqlSession session;
	
	
	//id 중복체크
	@RequestMapping(value="/checkid.htm", method= RequestMethod.GET)
	public SampleVO checkid(@RequestParam(value="userid") String userid){
		System.out.println("여기옴");
		
		UserDao userdao = session.getMapper(UserDao.class);
		SampleVO sampleVO = new SampleVO();
		
		String result = userdao.checkid(userid);
		
		if(result != "") {
			sampleVO.setResult("true");
		} else {
			sampleVO.setResult("false");
		}
		
		System.out.println(sampleVO.getResult());
		
		return sampleVO;
	}
}
