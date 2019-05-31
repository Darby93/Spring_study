package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/emp/*")
public class EmpController {
	
	@RequestMapping("/empList.htm")
	public String getEmpList() {
		
		return "emp.empList";
	}
}
