package DI_11_Spring;

public class DataSourceFactory {
	private String jdbcDriver;
	private String url;
	private String username;
	private String password;
	
	
	public void setJdbcDriver(String jdbcDriver) {
		this.jdbcDriver = jdbcDriver;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "DataSourceFactory : jdbcDriver=" + jdbcDriver + ", url=" + url + ", username=" + username + ", password="
				+ password;
	}
	
	
	
}
