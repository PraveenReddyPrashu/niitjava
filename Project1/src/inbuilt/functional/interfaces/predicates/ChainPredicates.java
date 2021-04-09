package inbuilt.functional.interfaces.predicates;

import java.util.function.Predicate;

public class ChainPredicates {
public static void main(String[] args) {
	Predicate<Integer> p1 = i -> i%2 == 0;
	Predicate<Integer> p2 = i -> i>10;
	int[] intArray = {10,5,7,35,11,54,22,48,8};
	
	System.out.println("if no >10 and if it is even then print it");
	for (int i : intArray) {
		if(p1.and(p2).test(i)) {
			System.out.println(i);
		}
	}
	
	System.out.println("if no >10 or if it is even then print it");
	for (int i : intArray) {
		if(p1.or(p2).test(i)) {
			System.out.println(i);
		}
	}
}
}
