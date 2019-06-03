package controllers;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dao.EmpDao;
import vo.EmpDto;

@Controller
@RequestMapping("/emp/*")
public class EmpController {
	
	@Autowired
	private SqlSession session;
	
	
	
	@RequestMapping("empList.htm")
	public String getEmpList(EmpDto empDto,Model model) throws Exception {
		
		EmpDao empdao = session.getMapper(EmpDao.class);
		
		List<EmpDto> list = empdao.getEmpList();
		
		model.addAttribute("emplist", list);
		
		return "emp.empList";
	}
	
	@RequestMapping(value="empDetail.htm", method=RequestMethod.GET)
	public String empDetail(int empno, Model model) throws Exception {
		
		EmpDao empdao = session.getMapper(EmpDao.class);
		
		EmpDto dto = empdao.getEmpByEmpNo(empno);
		
		model.addAttribute("empdetail", dto);
		
		return "emp.empDetail";
	}
	
	@RequestMapping(value="empReg.htm", method=RequestMethod.GET)
	public String empInsert() throws Exception {
		
		return "emp.empReg";
	}
	
	@RequestMapping(value="empReg.htm", method=RequestMethod.POST)
	public String empInsert(EmpDto dto) throws Exception {
		
		EmpDao empdao = session.getMapper(EmpDao.class);
		
		empdao.insertEmp(dto);
		
		return "redirect:empList.htm";
	}
	
	@RequestMapping(value="empDelete.htm", method=RequestMethod.GET)
	public String empDelete(int empno) throws Exception {
		
		EmpDao empdao = session.getMapper(EmpDao.class);
		
		empdao.deleteEmp(empno);
		
		return "redirect:empList.htm";
	}
	
	@RequestMapping(value="empUpdate.htm", method=RequestMethod.GET)
	public String empUpdate(int empno, Model model) throws Exception {
		
		EmpDao empdao = session.getMapper(EmpDao.class);
		
		EmpDto dto = empdao.getEmpByEmpNo(empno);
		
		model.addAttribute("empdetail", dto);
		
		return "emp.empUpdate";
	}
	
	@RequestMapping(value="empUpdate.htm", method=RequestMethod.POST)
	public String empUpdate(EmpDto dto) throws Exception {
		
		System.out.println(dto.getEmpno());
		
		EmpDao empdao = session.getMapper(EmpDao.class);
		
		empdao.updateEmp(dto);
		
		return "redirect:empList.htm";
	}
	
	@RequestMapping("search.htm")
	public String getEmpListbyEmpno(int empno, Model model) throws Exception {
		
		System.out.println(empno);
		EmpDao empdao = session.getMapper(EmpDao.class);
		
		EmpDto dto = empdao.getEmpByEmpNo(empno);
		
		model.addAttribute("emp", dto);
		
		return "emp.empList";
	}
}
