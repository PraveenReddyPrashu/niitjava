package lambdaexpressions.anonymous;

public class SecondTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person employee = new Person() {
			@Override
			void eat() {
				System.out.println("anonymous employee is eating");
			}
		};
		employee.eat();

		Thread t = new Thread() { public void run() {
			System.out.println("child thread");
		}
		};
		t.start();

		Runnable r = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("I am in runnable");
			}
		};
		Thread t1 = new Thread(r);
		t1.start();
	}
}