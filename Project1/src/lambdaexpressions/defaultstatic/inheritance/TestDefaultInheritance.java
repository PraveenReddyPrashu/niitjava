package lambdaexpressions.defaultstatic.inheritance;

public class TestDefaultInheritance implements Left, Right{
	@Override
	public void m1() {
		Left.super.m1();
	}
	public static void main(String[] args) {
		TestDefaultInheritance tdi = new TestDefaultInheritance();
		tdi.m1();
	}
}
