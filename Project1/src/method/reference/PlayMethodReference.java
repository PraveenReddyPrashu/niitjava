package method.reference;

public class PlayMethodReference {
public static void main(String[] args) {
	Runnable r = PlayMethodReference::m1;
	Thread t = new Thread(r);
	t.start();
	for (int i = 0; i < 10; i++) {
		System.out.println("I'm in main thread");
	}
}
public static void m1() {
	for (int i = 0; i < 10; i++) {
		System.out.println("I'm from m1 method");
	}
}
}
