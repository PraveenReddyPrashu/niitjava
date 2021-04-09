package lambdaexpressions.defaultstatic;

public class TestDefault {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstImpl fImpl = new FirstImpl();
		fImpl.method3();
		
		MyList myList = new MyList();
		myList.add();
		myList.append();
		
		System.out.println(IUtility.isEligible(18));
	}

}