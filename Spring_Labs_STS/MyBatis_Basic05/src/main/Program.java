package main;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.or.bit.dto.User;
import kr.or.bit.service.sqlMapClient;

public class Program {

	public static void main(String[] args) {
		//method scope
		
		SqlSessionFactory sqlsession = sqlMapClient.getSqlSession();
		
		SqlSession session = sqlsession.openSession();
		User user = (User)session.selectOne("Emp.getone" , "SMITH");
		
		System.out.println(user.getEmpno());
		
		session.close();
		
	}

}
