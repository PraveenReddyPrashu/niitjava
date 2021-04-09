package lambdaexpressions.defaultstatic;

public class FirstImpl implements SomeInterface {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("method1 in firstimpl");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("method2 in firstimpl");
	}
	
	@Override
	public void method3() {
		//SomeInterface.super.method3();
		System.out.println("overridden firstimpl of method3");
	}

}
