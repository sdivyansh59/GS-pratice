package java8concepts;

@FunctionalInterface
public interface FunctionalInterface1 {
	void m1();
	
	default void  m2() {
		System.out.println("m2 is a default method inside interface");
	}
	
	static void m3() {
		System.out.println("m3 is a static method inside interface");
	}

}
