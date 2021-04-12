package method.reference;

public class StaticMethodReference{
public static void myAdd(int a, int b) {
	System.out.println(a+b);
}
public static void main(String[] args) {
	SMRefInterface s = StaticMethodReference::myAdd;
	s.add(10, 20);
}
}
