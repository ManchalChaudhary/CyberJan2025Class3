package stringFunctions;

public class StringImmutable {

	public static void main(String[] args) {
		//why the String are immutable and enumerable?
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		String str4 = new String("Hello");
	
		System.out.println(str1==str2);
		System.out.println(str3==str4);
		System.out.println(str2==str4);
//		str2 = "Welcome";
//		System.out.println(str1==str2);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}

}
