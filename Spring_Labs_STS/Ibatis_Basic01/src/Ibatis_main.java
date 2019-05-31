

import Ibatis.dao.EmpDao;
import Ibatis.dto.Emp;

public class Ibatis_main {

	public static void main(String[] args) {
		EmpDao dao = EmpDao.getinstance();
		
		//insert
		Emp e = new Emp();
		e.setEmpno(7777);
		e.setEname("jang");
		e.setJob("Not");
		e.setSal(10);
		
		try {
		   dao.insertEmp(e);
		   Emp empdata = dao.SelectEmp("hong");
		   System.out.println(empdata.toString());
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		

	}

}
