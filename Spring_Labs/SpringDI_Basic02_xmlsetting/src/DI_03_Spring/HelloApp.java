package DI_03_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("classpath:DI_03_Spring/DI_03.xml"); 
																	//파라미터로 classpath : 패키지/xml파일 
		
		//필요하다면 컨테이너(context) 안에서 객체를 반환 받아서 사용!
		MessageBean message = context.getBean("message", MessageBean.class); //genericxmlApplicationContext 파라미터    (설정id , 타입!)
		
		message.sayHello("에휴");
		
	}

}
