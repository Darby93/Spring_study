package AOP_Basic_02_JAVA;

import java.lang.reflect.Proxy;

public class Program {

	public static void main(String[] args) {
		Calc calc = new NewCalc();
		
		//Proxy 객체 통해서 처리
		
		Calc cal = (Calc)Proxy.newProxyInstance(calc.getClass().getClassLoader(), //실제 클래스의 메타정보
								calc.getClass().getInterfaces(), //행위 정보 (add, sub, mul)
								new LogPrintHandler(calc)); //보조관심 >> 실객체 주소를 넣은
		
		System.out.println("ADD : " + cal.ADD(14124, 2626));
		System.out.println();
		System.out.println("SUB : " + cal.SUB(14124, 2626));
		System.out.println();
		System.out.println("MUL : " + cal.MUL(14, 26));
		
	}

}
