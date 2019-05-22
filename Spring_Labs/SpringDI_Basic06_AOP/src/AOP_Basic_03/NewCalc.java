package AOP_Basic_03;

public class NewCalc implements Calc{

	@Override
	public int ADD(int x, int y) {
		//보조업무(공통사항 : cross-cutting-concern) 이 있었지 basic 01에서
		int sum = x+y; // 주업무 (core-corcern)
		//보조업무(공통사항 : cross-cutting-concern) 이 있었지 basic 01에서
		return sum;
	}

	@Override
	public int MUL(int x, int y) {
		//보조업무(공통사항 : cross-cutting-concern) 이 있었지 basic 01에서
		int mul = x*y; // 주업무 (core-corcern)
		//보조업무(공통사항 : cross-cutting-concern) 이 있었지 basic 01에서
		return mul;
	}

	@Override
	public int SUB(int x, int y) {
		//보조업무(공통사항 : cross-cutting-concern) 이 있었지 basic 01에서
		int sub = x-y; // 주업무 (core-corcern)
		//보조업무(공통사항 : cross-cutting-concern) 이 있었지 basic 01에서
		return sub;
	}

}
