package optExp;

 

public class PostfixTest {

 

	public static void main(String[] args) {

		OptExp2 opt = new OptExp2();

		int result;

		String exp = "35*62/-";

		System.out.printf("\n후위표기식 : %s", exp);

		result = opt.evalPostfix(exp);

		System.out.printf("\n연산결과 = %d\n", result);

	}

}