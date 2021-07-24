package reset;

public class MathTest {
	public static void Arithmetic(){
		try{
		int x = 5;
		int y = 0;
		int v = x/y;
		System.out.println(v);
	} catch(ArithmeticException e) {
		System.out.println("Arithmetic Exception caught");
	}
		
}
}
