package lambdaexpressions.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestEmployees {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Praveen",34));
		employees.add(new Employee("Venkata",56));
		employees.add(new Employee("Vinay",45));
		employees.add(new Employee("Pavan",23));
		employees.add(new Employee("Mohan",12));

		System.out.println(employees);
		Comparator<Employee> c = (e1,e2) -> (e1.eid < e2.eid)? -1 :(e1.eid > e2.eid)? 1 :0;

		Collections.sort(employees,c);
		System.out.println(employees);

	}

}