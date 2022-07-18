package java8concepts;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierUSeCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> supplier = ()-> "Hi this is supplier method";
		System.out.println(supplier.get());
		
		Supplier<Integer> supplier2 = ()-> 10000;
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		List<Integer> list2 = Arrays.asList();
		System.out.println( list2.stream().findAny().orElseGet(supplier2));
		
	}

}
