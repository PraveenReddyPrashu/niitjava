package inbuilt.functional.interfaces;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestPredicate {
	
	static public ArrayList<Employee> employees;
	
	static public ArrayList<Student> students;
	public static void main(String[] args) {
		Predicate<Integer> p = i -> i % 2 == 0;
		System.out.println(p.test(10));
		populateEmployees();
		
		Predicate<Employee> p1 = (e) -> e.salary>=10000;
		
		for (Employee e : employees) {
			if(p1.test(e)) {
				System.out.println(e.name);
			}
		}
		
		populateStudents();
		
		Predicate<Student> p2 = (s) -> ((s.m1+s.m2+s.m3)>75)? true : false;
		
		for (Student s : students) {
			if(p2.test(s)) {
				System.out.println(s.name+" pass");
			}
			else {
				System.out.println(s.name+" fail");
			}
		}
	}
	
	private static void populateEmployees() {
		employees = new ArrayList<Employee>();
		employees.add(new Employee("Praveen", 100000));
		employees.add(new Employee("Pavan", 10000));
		employees.add(new Employee("Kiran", 5000));
		employees.add(new Employee("Mohan", 9000));
		employees.add(new Employee("Vinay", 50000));
					
	}
	
	private static void populateStudents() {
		students = new ArrayList<Student>();
		students.add(new Student("Praveen",35, 35, 35));
		students.add(new Student("Pavan",45, 15, 10));
		students.add(new Student("Kiran",35, 25, 35));
		students.add(new Student("Mohan",45, 25, 35));
		students.add(new Student("Vinay",45, 35, 35));
	}
	
}
