package DI_05_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {
//		MyBean mybean = new MyBean();
//		MyBean mybean2 = new MyBean("hong");
//		
//		Singleton single = Singleton.getInstance();
//		Singleton single2 = Singleton.getInstance();
//		
//		// 참조변수으 ㅣ주소값
//		System.out.println("mybean  : " + mybean );
//		System.out.println("mybean2  : " + mybean );
//		System.out.println("single  : " + single );
//		System.out.println("single2  : " + single2 );
		
		//key point\
		//컨테이너 구성되고  xml read 해서 객체생성 조립
		//필요하다면 컨테이너에 있는 객체를 사용
		//getbean () return type object >> down casting  사용
		//주의 : getgean () 호출할 때 만 새로운 객체를 만들지 않아요(x)
		//모든 객체의 타입 ( 컨테이너 ) : default (Singleton)
		
		ApplicationContext context = new GenericXmlApplicationContext("classpath:DI_05_Spring/DI_05.xml");
		System.out.println("before : mybean 객체");
		MyBean mybean = context.getBean("mybean", MyBean.class);
		System.out.println("after : mybean 객체 : " + mybean);
		
		System.out.println("before : mybean 객체");
		MyBean mybean2 = context.getBean("mybean", MyBean.class);
		System.out.println("after : mybean 객체 : " + mybean2);
		
		System.out.println("before : mybean2 객체");
		MyBean mybean3 = context.getBean("mybean2", MyBean.class);
		System.out.println("after : mybean2 객체 : " + mybean3);
		
		Singleton single = context.getBean("single", Singleton.class);
		System.out.println("singleton 객체 : "  + single);
		
		Singleton single2 = context.getBean("single", Singleton.class);
		System.out.println("singleton 객체 : "  + single2);
	}

}
