package reset;

public class FormatTest {
	public static void Formatting(){
		try {
		var stem = Integer.parseInt("a million rands");
		System.out.println(stem);
	} catch(NumberFormatException e) {
		System.out.println("Number Format Exception handled");
	}
	}
}
