package Spring_DI4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {
	public static void main(String[] args) {
		//NewRecordView view = new NewRecordView(100, 70, 80);
				/*
				 * xml 설정에서 작업 .......
				 * NewRecord record = new NewRecord(); 
				 * NewRecordView view = new NewRecordView();
				 * view.setRecord(record);
				 */
				
				//view.input();
				
				//view.print();
		
		//SpringFramework 이 제공하는 메모리 사용
		//(IOC 컨테이너) 만들고 그 공간에 [객체 생성 조립 >> XML 문서에게]
		ApplicationContext context = new ClassPathXmlApplicationContext("DIConfig.xml");
		
		RecordView view = (RecordView)context.getBean("view");
		
		//코드가 실행되면 IOC 컨테이너 생성 -> DIConfig.xml read -> 객체 생성, 주입 > END
		view.input();
		view.print();
	}
}
