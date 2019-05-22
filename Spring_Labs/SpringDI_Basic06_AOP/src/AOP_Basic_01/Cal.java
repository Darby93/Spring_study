package AOP_Basic_01;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

//간단한 계산기 프로그램

/*
	- 주관심 (업무) : 사칙연산(add,mul) -> 기능(함수)
	- 보조관심 (공통사항) : 연산에 걸리는 시간 출력
	- log 출력 ( console 출력 : 시스템에서 출력하는 것 처럼 red 색으로) 
 */

public class Cal {
	
	Log log = LogFactory.getLog(this.getClass());
	
	//System.currentTimeMillis()
	StopWatch sw = new StopWatch();
	
	public int Add (int x, int y) {
		
		sw.start();
		log.info("[더하기 타이머 시작] ");
		
		int result = x+y; //  주관심
		
		
		sw.stop();
		
		log.info("[더하기 종료] ");
		log.info("[TIME LOG] Method : ADD");
		log.info("[TIME LOG] Method TIME : " + sw.getTotalTimeMillis());
		
		return result;
	}
	
	public long Mul (int x, int y) {
		
		sw.start();
		log.info("[곱하기 타이머 시작] ");
		
		int result = x*y; //  주관심
		
		
		sw.stop();
		
		log.info("[곱하기 종료] ");
		log.info("[TIME LOG] Method : MUL");
		log.info("[TIME LOG] Method TIME : " + sw.getTotalTimeMillis());
		
		return result;
	}
	
	
	
	
	
}
