package DI_Annotation_05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Program {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigContext.class);
		
		User user = context.getBean("user", User.class);
		user.userMethod();
		
		User2 user2 = context.getBean("user2", User2.class);
		user2.userMethod2();
		System.out.println(user2.toString());
		
		User2 user3 = context.getBean("user2", User2.class);
		user3.userMethod2();
		System.out.println(user3.toString());
	}

}
