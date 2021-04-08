package lambdaexpressions.anonymous;

public class ThirdTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfacez interfacez = new Interfacez() {

			@Override
			public void m2() {
				System.out.println("m2-- interfacez");
			}

			@Override
			public void m1() {
				System.out.println("m1-- interfacez");

			}
		};

		interfacez.m1();
		interfacez.m2();
	}

}
