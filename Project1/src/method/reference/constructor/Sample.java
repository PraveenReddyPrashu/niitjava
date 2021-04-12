package method.reference.constructor;

public class Sample {
	public Sample() {
		System.out.println("default Sample constructor called");
	}
	public Sample(String name) {
		System.out.println("Sample constructor called "+name);
	}
}
