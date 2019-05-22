package AOP_Basic_07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("classpath:AOP_Basic_07/ApplicationContext.xml");
		Calc calc = context.getBean("proxy", Calc.class);
		
		int result = calc.SUB(124155, 51512); //보조업무가 실행되면 안됨
		
//		int result = calc.ADD(124155, 51512);
		System.out.println(result);
	}

}
