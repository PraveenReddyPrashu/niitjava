package lambdaexpressions.defaultstatic;

public interface ICollection {
	void add();
	void remove();
	default void append() {System.out.println("defult append");
	}
	default void removeAll() {System.out.println("default remove");
	}
}