package inbuilt.functional.interfaces;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestPredicate {
	
	static public ArrayList<Employee> employees;
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
	}
	
	private static void populateEmployees() {
		employees = new ArrayList<Employee>();
		employees.add(new Employee("Praveen", 100000));
		employees.add(new Employee("Pavan", 10000));
		employees.add(new Employee("Kiran", 5000));
		employees.add(new Employee("Mohan", 9000));
		employees.add(new Employee("Vinay", 50000));
					
	}
}
