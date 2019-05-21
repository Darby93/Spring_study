package DI_10_Spring;

import java.util.Properties;

public class BookClient {
	private Properties config;
	
	public void setConfig (Properties config) {
		this.config = config;
		System.out.println("setter함수 실행");
	}
	
	//일반함수 ( 출력 )
	public void connet() {
		
		String server = config.getProperty("server");
		String timeout = config.getProperty("connectiontimeout");
		
		System.out.println("server : " + server);
		System.out.println("time : " + timeout);
		
	}
}
