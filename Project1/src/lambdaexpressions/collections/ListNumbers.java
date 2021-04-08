package lambdaexpressions.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ListNumbers {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(15);
		al.add(5);
		al.add(30);
		al.add(10);
		al.add(8);
		al.add(19);
		System.out.println(al);
		Comparator<Integer> c = (o1,o2)->(o1 < o2)? -1 : (o1 > o2)? 1 : 0;
		Collections.sort(al,c);// new Comapator = c
		System.out.println(al);
	}

}