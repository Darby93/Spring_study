package AOP_Basic_04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("classpath:AOP_Basic_04/ApplicationContext.xml");
		Calc calc = context.getBean("proxy", Calc.class);
		
		int result = calc.MUL(124, 51512);
		System.out.println(result);
	}

}
