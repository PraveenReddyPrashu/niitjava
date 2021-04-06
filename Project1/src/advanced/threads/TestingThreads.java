package advanced.threads;

public class TestingThreads {
	public static void main(String[] args) {//main method is noc process
		JoinDemoThread t1 = new JoinDemoThread("one");
		JoinDemoThread t2 = new JoinDemoThread("two");
		JoinDemoThread t3 = new JoinDemoThread("three");

		t1.start();

		try {
			t1.join(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		t3.start();
	}
}