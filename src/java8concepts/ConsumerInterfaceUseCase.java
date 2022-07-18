package java8concepts;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceUseCase {
	public static void main(String[] args) {
		
		Consumer <Integer> consumer = (t) ->{
			System.out.println("Printing: "+t);
		};
		
		consumer.accept(20);
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		list.stream().forEach(consumer);
		System.out.println("********************");
		list.stream().forEach((t)-> System.out.println("Printing: "+t*t));
	}
}

class Myconsumer  implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		// TODO Auto-generated method stub
		
	}
	
}
