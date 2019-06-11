package com.bit.team1;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dao.EmpDao;
import vo.EmpDto;



@RestController
@RequestMapping("/restajax/*")
public class AjaxRestController {
	
	@Autowired
	private SqlSession session;
	
	@RequestMapping(value="rest", method=RequestMethod.GET)
	public List<EmpDto> rest() throws Exception {
		EmpDao empdao = session.getMapper(EmpDao.class);
		List<EmpDto> list = empdao.getEmpList();
		
		return list;
	}
}
