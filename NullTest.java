package reset;

public class NullTest {
	public static void maths() {
		try{
			String empty = null;
		
		if(empty.endsWith("s")) {
			System.out.println("Right value");
		}else {
			System.out.println("wrong value");
		}
		}
		catch(NullPointerException e) {
			System.out.println("Null Pointer Exception caught");
		}
	}
	}
	