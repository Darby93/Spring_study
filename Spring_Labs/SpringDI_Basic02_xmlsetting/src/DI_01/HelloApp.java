package DI_01;

public class HelloApp {

	public static void main(String[] args) {
		MessageBean messagebean = new MessageBean();
		messagebean.sayHello("용용");
	}

}
/*
요구사향
영문버전(hong) : Hello hong!
한글버전(hong) : 안녕 hong!

기능 2가지

>MessageBean_kr > 함수 > sayHello
>MessageBean_en > 함수 > sayHello

>> 위 두개의 클래스에 대해서 Interface ... 다형성!

*/