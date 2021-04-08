package lambdaexpressions;

import java.util.function.Function;

public class FirstLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sq4 = squareIt(4);
		System.out.println(sq4);

		FuncInterface fi = () -> System.out.println("hello");

		Function<Integer,Integer> f = n -> n*n;
		ISum is = (a,b) -> a+b;

		System.out.println(f.apply(4));
		fi.m1();
		System.out.println(is.sum(10,20));
	}
	public static int squareIt(int n) {
		return n*n;
	}

	public static void m1() {
		System.out.println("hello");	
	}

	public static int add(int a, int b) {
		return a+b;
	}
}
