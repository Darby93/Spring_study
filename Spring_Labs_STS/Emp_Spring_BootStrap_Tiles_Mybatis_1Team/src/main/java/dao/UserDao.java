package dao;

import vo.EmpUser;

public interface UserDao {
	public String loginEmp(String userid);
	public void insertUser(EmpUser empUser) throws Exception;
}
