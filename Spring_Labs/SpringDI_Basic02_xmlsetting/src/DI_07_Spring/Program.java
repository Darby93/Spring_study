package DI_07_Spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Program {
	public static void main(String[] args) {
		
		ApplicationContext context = 
				new GenericXmlApplicationContext("classpath:DI_Produce/DI_Produce.xml");
		
		ProtocolHandler handler = context.getBean("handler" , ProtocolHandler.class);
		System.out.println("필터 사이즈으 !! : " + handler.filter_Length());
		
	}
}
