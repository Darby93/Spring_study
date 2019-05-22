package AOP_Basic_01;

public class Program {

	public static void main(String[] args) {
		Cal cal = new Cal();
		int result = cal.Add(124124, 124156);
		System.out.println(result);
		
		
		long result2 = cal.Mul(124412321, 124156);
		System.out.println(result2);
	}

}
