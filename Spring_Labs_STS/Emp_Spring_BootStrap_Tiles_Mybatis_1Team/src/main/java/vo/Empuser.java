package vo;

public class Empuser {
//	create table empuser 
//    (
//        userid varchar2(20),
//        password varchar2(20),
//        username varchar2(20),
//        authority number,
//        email varchar(20)
//    );
	
	private String userid;
	private String password;
	private String username;
	private int authority;
	private String email;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAuthority() {
		return authority;
	}
	public void setAuthority(int authority) {
		this.authority = authority;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
