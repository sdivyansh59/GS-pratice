package java8concepts;

public class FunctionalInterface1Impl  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		FunctionalInterface1Impl obj1 = new FunctionalInterface1Impl();
//		obj1.m1();
		FunctionalInterface1 fi = ( )-> System.out.println("abstract method m1 is defined in implementation class");
	
		fi.m1();
	}

//	@Override
//	public void m1() {
//		// TODO Auto-generated method stub
//		System.out.println("abstract method m1 is defined in implementation class");
//	}

}
