package stringFunctions;

public class StringSplit {

	public static void main(String[] args) {
		String fruits = "What is you name?";
		String[] fruitArray = fruits.split(" ");
		System.out.println(fruitArray[1]);
		System.out.println(fruitArray.length-1);
	}

}
