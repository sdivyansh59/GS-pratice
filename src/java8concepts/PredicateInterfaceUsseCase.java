package java8concepts;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterfaceUsseCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MyPredicate mypre = new MyPredicate();
//		System.out.println(mypre.test(11));
//		System.out.println(mypre.test(10));

		
		Predicate <Integer> predicate = (t)->{
			if((t&1) ==0 ) return true;
			return false;
		};
		
		//System.out.println(predicate.test(20));
		//System.out.println(predicate.test(11));
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		list.stream().filter(predicate).forEach((t)-> System.out.println(t+" is Even"));;
		
		
		
	}
}


//class MyPredicate  implements Predicate<Integer> {
//
//	@Override
//	public boolean test(Integer t) {
//		if((t&1) ==0 ) return true;
//		return false;
//	}
//	
//}
