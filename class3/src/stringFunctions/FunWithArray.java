package stringFunctions;

import java.util.Arrays;

public class FunWithArray {

	public static void main(String[] args) {
		int[] grades = {95, 56, 67, 54, 65};  // 5, 4
		
		String[] students = new String[4];   // 4, 3
		//How can we enter the values to array?
//		ArrayName[index number] = values;
		//Array sorting
		students[0] = "Tenny";
		students[1] = "Mohn";
		students[2] = "Sonny";
		students[3] = "Aonna";
		String teacher[] = new String[4];
		System.out.println(students[0] +": " + grades[0]);
		Arrays.sort(students);
		Arrays.sort(grades);
		System.out.println(students[0] +": " + grades[0]);
	}

}
