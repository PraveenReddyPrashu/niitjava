package basics;

public class Student {
	String name;
	int age;
	int marks;
	boolean isElgible;
	static String COLLEGE_NAME = "IIT";
	public Student(){}
	public Student(String name,int age) {
		this.name = name;
		this.age =age;			
	}
	public Student(String name, int age, int marks,boolean isElgible) {
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.isElgible = isElgible;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {return name;}
}