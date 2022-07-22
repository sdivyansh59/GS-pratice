package java8concepts;

import java.util.Arrays;
import java.util.List;

public class ForEachPractice {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		list.forEach(ele -> System.out.println(ele));
		
//		for(int ele : list) {
//			System.out.println(ele);
//		}
		
		list.stream().filter( ele -> (ele&1)==0 ).forEach( ele -> System.out.println(ele));;
	}
}
