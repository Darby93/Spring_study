package kr.or.bit.service;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class sqlMapClient {
	/*
	 * private static SqlSession session;
	 * 
	 * private static SqlSessionFactory factory = (SqlSessionFactory) new
	 * SqlSessionFactoryBuilder();
	 * 
	 * public static SqlSessionFactory getFactory() { return factory; }
	 * 
	 * static { String resource = "SqlMapConfig.xml";
	 * 
	 * try { Reader reader = Resources.getResourceAsReader(resource);
	 * SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
	 * session = factory.openSession(); } catch (Exception e) {
	 * 
	 * }
	 * 
	 * }
	 * 
	 * public static SqlSession getSqlSession() { return session; }
	 */

	private static SqlSessionFactory sqlSessionFactory;


	static {
		String resource = "SqlMapConfig.xml";

		try {
			Reader reader = Resources.getResourceAsReader(resource);
			sqlSessionFactory= new SqlSessionFactoryBuilder().build(reader);
		} catch (Exception e) {

		}

	}

	public static SqlSessionFactory getSqlSession() {
		return sqlSessionFactory;
	}
}
