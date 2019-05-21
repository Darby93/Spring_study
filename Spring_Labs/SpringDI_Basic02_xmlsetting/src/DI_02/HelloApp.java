package DI_02;

public class HelloApp {

	public static void main(String[] args) {
		
		
		
		//interface 다형성 (하나의 참조 변수가 여러개의 주소를 가질  수 있다)
		
		MessageBean messagebean_kr = new MessageBean_kr();
		messagebean_kr.sayHello("용용");
		
		
		MessageBean messagebean_en = new MessageBean_en();
		messagebean_en.sayHello("용용");
		
		
	}

}
