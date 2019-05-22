package DI_Annotation_05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/*
	ConfigContext 자바파일로 xml 설정 파일을 대체하겠다.
	ConfigContext 자바 가지고 객체의 생성과 조립 (주입)
	
	@Configuration 이붙으면 xml 파일과 같은 기능을 하는 클래스이다!
	
	xml 문서라면
	<bean id= "user" class="DI_Annotation_05.User"/>
	<bean id= "user" class="DI_Annotation_05.User2"/>
	
	위 코드를 자바파일 에서는 함수로 만들어서 객체를 리턴!
	
*/


@Configuration
public class ConfigContext {
	
	@Bean
	@Scope("prototype")
	public User user () { // 함수 이름 = 아이디 <bean id= "user" class="DI_Annotation_05.User"/>
		return new User();
	}
	
	@Bean
	@Scope("prototype")
	public User2 user2() {
		return new User2();
	}
	
}
