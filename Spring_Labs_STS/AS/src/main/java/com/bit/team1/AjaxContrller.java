package com.bit.team1;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.View;

import com.fasterxml.jackson.databind.ObjectMapper;

import dao.EmpDao;
import vo.EmpDto;

@Controller
@RequestMapping("/ajax/*")
public class AjaxContrller {

	@Autowired
	private View jsonview;
	
	@Autowired
	private SqlSession session;
	
	
	
	@RequestMapping(value="response", method=RequestMethod.GET)
	public void response(HttpServletResponse response) throws Exception {
		System.out.println("response 들어옴");
		EmpDao empdao = session.getMapper(EmpDao.class);
		List<EmpDto> list = empdao.getEmpList();
		

		String jsonStr = "[";
		for(int i=0;i<list.size();i++) {
			jsonStr +=
			           "{\"empno\":\""+list.get(i).getEmpno()
			           +"\",\"ename\":\""+list.get(i).getEname()
			           +"\",\"job\":\""+list.get(i).getJob()
			           +"\",\"mgr\":\""+list.get(i).getMgr()
			           +"\",\"hiredate\":\""+list.get(i).getHiredate()
			           +"\",\"sal\":\""+list.get(i).getSal()
			           +"\",\"comm\":\""+list.get(i).getComm()
			           +"\",\"deptno\":\""+list.get(i).getDeptno()+"\"}";
			            if(i!=list.size()-1) {
			            	jsonStr+=",";
			            }
		}
		jsonStr += "]";
		response.getWriter().print(jsonStr);
	}
	
	@RequestMapping(value="objectmapper", method=RequestMethod.GET)
	public void objectMapper(HttpServletResponse response) throws Exception {
		EmpDao empdao = session.getMapper(EmpDao.class);
		List<EmpDto> list = empdao.getEmpList();
		ObjectMapper mapper = new ObjectMapper();
		response.getWriter().print(mapper.writeValueAsString(list));
	}
	
	@RequestMapping(value="responsebody", method=RequestMethod.GET)
	public @ResponseBody List<EmpDto> ajaxResponseBody() throws Exception{
		EmpDao empdao = session.getMapper(EmpDao.class);
		List<EmpDto> list = empdao.getEmpList();
		
		return list;  
	}
	
	@RequestMapping(value="jsonview", method=RequestMethod.GET)
	public View jsonView(Model model) throws Exception{
		
		EmpDao empdao = session.getMapper(EmpDao.class);
		
		List<EmpDto> list = empdao.getEmpList();
			
		model.addAttribute("list", list);
		
		return jsonview;  
	}
	
}
