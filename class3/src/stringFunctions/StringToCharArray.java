package stringFunctions;

public class StringToCharArray {

	public static void main(String[] args) {
		String a = "hello";
		char[] myArray = a.toCharArray();
		
		System.out.println(myArray[0]);
		System.out.println(myArray[1]);
		System.out.println(myArray[2]);
		System.out.println(myArray[3]);
		System.out.println(myArray.length-1);

	}

}
