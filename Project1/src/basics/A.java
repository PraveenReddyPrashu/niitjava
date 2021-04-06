package basics;

public class A {  
	static void m(){System.out.println("hello m");}  
	static void n(){  
		System.out.println("hello n");  
		//m();//same as this.m()  
		m();  
	}   
	public static void main(String args[]){  
		n();  
	}  
}