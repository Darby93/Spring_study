package dao;

import java.util.List;

import vo.EmpDto;

public interface EmpDao {
	
	public void insertEmp(EmpDto dto) throws Exception;
	
	public List<EmpDto> getEmpList() throws Exception;
	
	public EmpDto getEmpByEmpNo(int empno) throws Exception;
	
	public void updateEmp(EmpDto dto) throws Exception;
	
	public void deleteEmp(int empno) throws Exception;
	
}
