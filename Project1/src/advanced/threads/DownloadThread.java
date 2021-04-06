package advanced.threads;

public class DownloadThread extends Thread {
	@Override
	public void run() {
		System.out.println("downloading something");
	}
}
