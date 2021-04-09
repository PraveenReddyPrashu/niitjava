package inbuilt.functional.interfaces.functions;

import java.util.ArrayList;
import java.util.function.Function;

public class StudentTest {
	static ArrayList<JavaStudent> javaStudents;

	public static void main(String[] args) {
		populateStudents();

		Function<JavaStudent, String> f = j -> {
			if(j.marks > 80) return "Distinction";
			else if (j.marks > 60) {
				return "first class";
			}
			return "pass class";
		};
		
		for (JavaStudent j : javaStudents) {
			System.out.println(j.name+"\t"+f.apply(j));
		}
	}

	public static ArrayList<JavaStudent> populateStudents() {
		javaStudents = new ArrayList<JavaStudent>();
		javaStudents.add(new JavaStudent("Praveen", 81));
		javaStudents.add(new JavaStudent("Pavan", 71));
		javaStudents.add(new JavaStudent("Kiran", 70));
		javaStudents.add(new JavaStudent("Mohan", 85));
		javaStudents.add(new JavaStudent("Vinay", 59));
		
		return javaStudents;
	}
}
