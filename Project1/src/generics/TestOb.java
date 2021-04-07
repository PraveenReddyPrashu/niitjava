package generics;

public class TestOb {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gen<String> g1 = new Gen<String>("Praveen");
		g1.show();
		System.out.println(g1.getOb());
		Gen<Integer> g2 = new Gen<Integer>(new Integer(10));
		Gen<?> g3 = new Gen<Integer>(new Integer(30));
		Gen<? super String> g4 = new Gen<Object>("");
		Gen<? extends Number> g5 = new Gen<Integer>(new Integer(3));
		g2.show();
		System.out.println(g2.getOb());
		Test<MyNumber> myTest = new Test<MyNumber>(new MyNumber(), new MyNumber());
	}

}
