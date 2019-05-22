package Team4_Assignment01;

import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class ConfigContext {
	
	@Bean
	public Lecture lecture() {
		return new Lecture("다빈");
	}
	
	@Bean
	public LectureAop lectureAop() {
		return new LectureAop();
	}
	
	
	
}
