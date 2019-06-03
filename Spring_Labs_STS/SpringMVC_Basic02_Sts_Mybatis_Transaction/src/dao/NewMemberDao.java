package dao;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import vo.Member;

@Repository
public class NewMemberDao implements MemberDao{
	
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	 
	
	/*
	return this.jdbctemplate.queryForObject(sql, new BeanPropertyRowMapper<Member>(Member.class),uid);
	*/
	
	public Member getMember(String uid) throws ClassNotFoundException, SQLException
	{
		
		String sql = "SELECT userid, pwd, name, gender, birth, is_lunar, cphone, email, habit, regdate FROM MEMBER WHERE UID=?";
		
		// select 컬럼명하고 DTO 가지는 memberfield 명이 같지 않은 경우
		// 이런경우는 있으면 안되지만  만약임 !!
		List<Member> results = jdbcTemplate.query(sql, new RowMapper<Member>() {

			@Override
			public Member mapRow(ResultSet rs, int rownum) throws SQLException {
				Member member = new Member();
				
				member.setUserid(rs.getString("userid"));
				member.setPwd(rs.getString("pwd"));
				member.setName(rs.getString("name"));
				member.setGender(rs.getString("gender"));
				member.setBirth(rs.getString("birth"));
				member.setIsLunar(rs.getString("is_lunar"));
				member.setCphone(rs.getString("cphone"));
				member.setEmail(rs.getString("email"));
				member.setHabit(rs.getString("habit"));
				member.setRegDate(rs.getDate("regdate"));
				
				return member;
			}
			
		});
		
		
		
		return results.isEmpty() ? null : results.get(0);
	}
	
	public int insert(final Member member) throws ClassNotFoundException, SQLException
	{
		
		return this.jdbcTemplate.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
				String sql = "INSERT INTO MEMBER(USERID, PWD, NAME, GENDER, BIRTH, IS_LUNAR, CPHONE, EMAIL, HABIT, REGDATE) VALUES( ?, ?, ?, ?, ?, ?, ?, ?, ?, SYSDATE)";
				
				PreparedStatement pstmt = conn.prepareStatement(sql);
				
				//parameter 지정 (별도의 가공)
				
				pstmt.setString(1, member.getUserid());
				pstmt.setString(2, member.getPwd());
				pstmt.setString(3, member.getName());
				pstmt.setString(4, member.getGender());
				pstmt.setString(5, member.getBirth());
				pstmt.setString(6, member.getIsLunar());
				pstmt.setString(7, member.getCphone());
				pstmt.setString(8, member.getEmail());
				pstmt.setString(9, member.getHabit());
				
				return pstmt;
				
			}
		});
		

	}
}
