
public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]=new int[5];
			a[5]=30/0;
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Arithmetic Exception");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Array index out of bound");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception");
		}
		System.out.println("rest of the code");
	}

}