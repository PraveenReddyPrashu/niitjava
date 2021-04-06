package advanced.threads;

public class PrintNosThreads extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<20; i++) {
				System.out.println(i);
		}
	}
}
