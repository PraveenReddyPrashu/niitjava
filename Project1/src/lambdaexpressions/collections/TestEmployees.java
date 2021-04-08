package lambdaexpressions.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestEmployees {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Praveen",56));
		employees.add(new Employee("Kiran",45));
		employees.add(new Employee("Vinay",34));
		employees.add(new Employee("Pavan",23));
		employees.add(new Employee("Mohan",12));

		System.out.println(employees);
		Comparator<Employee> c = (e1,e2) -> (e1.eid < e2.eid)? -1 :(e1.eid > e2.eid)? 1 :0;
		Comparator<Employee> n = (e1,e2) -> e1.name.compareTo(e2.name);
		Collections.sort(employees,c);
		System.out.println(employees);
		Collections.sort(employees,n);
		System.out.println(employees);

	}

}