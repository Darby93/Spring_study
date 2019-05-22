package Team4_Assignment01;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class LectureAop {
	  
	@Before("execution(* Team4_Assignment01.BitCamp.LectureStart(..))")
	public void StartBefore(){
		System.out.println("임경균 강사 : 수업 시작 할게요!\n");
	}
	
	@Before("execution(* Team4_Assignment01.BitCamp.LectureMiddle(..))")
	public void middle(){
		System.out.println("ZZZzzzzzzzzzzzz");
	}
	
	@Before("execution(* Team4_Assignment01.BitCamp.LectureEnd(..))")
	public void endBefore(){
		System.out.println("임경균 강사 : 수업 끝낼게요!\n");
	}
	 

}
