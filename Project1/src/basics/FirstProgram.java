package basics;

public class FirstProgram {

	public static void main(String[] args) {
		Student praveen;
		Student myStudent = new Student("Praveen",21);
		System.out.println("name is "+myStudent.name + " age is "+myStudent.age);
		praveen = new Student();
		praveen.setName("Venkata");
		praveen.age = 21;
		praveen.isElgible = true;
		praveen.marks = 456;

		System.out.println(praveen.getName());
		System.out.println(Student.COLLEGE_NAME);
		printNos();
		printDigit(10);
	}
	private static void printNos() {
		for(int i=0; i<=10; i++) {
			System.out.println(i);
		}
	}
	private static void printDigit(int number) {
		switch (number) {
		case 10:
			System.out.println("ten");
			break;

		case 20:
			System.out.println("twenty");

			break;
		case 30:
			System.out.println("thirty");

			break;
		}
	}

}
