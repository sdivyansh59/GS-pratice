package java8concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentSortImpl {
	
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1,"Divyansh"));
		list.add(new Student(2,"Ankit"));
		list.add(new Student(3,"Priyanka"));
		
		Collections.sort(list, ( obj1,  obj2)->{
			return obj1.getName().compareTo(obj2.getName());
		});
		System.out.println(list);
		
	}

}
