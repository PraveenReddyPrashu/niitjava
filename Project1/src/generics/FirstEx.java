package generics;

import java.util.ArrayList;

public class FirstEx {
	public static void main(String[] args) {
		String[] students = new String[3];
		students[0] = "Praveen";
		students[1] = "Reddy";
		String name = students[0];
		ArrayList<String> studentsList = new ArrayList<String>();
		studentsList.add("Praveen");
		System.out.println(studentsList);
		String name1 =  studentsList.get(0);
		System.out.println(name1);
	}
}
