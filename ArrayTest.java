package reset;

public class ArrayTest {
public static void Bounds() {
try{
	String steam = "Callable";
	String[] vest =new String [2];
vest[0] = "kim";
System.out.println(vest[3]);
System.out.println(steam.charAt(9));
} 
catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("Array Index Out Of Bounds  Exception Handled");
}
catch(StringIndexOutOfBoundsException ex) {
	System.out.println("String index out of Bounds Exception Handled");
}
}
}

