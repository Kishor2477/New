package learncollections;

import java.util.ArrayList;
import java.util.Iterator;

public class LearnArrayList {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Namee", "QA", 27);
		Employee e2 = new Employee("Names", "DEV", 32);
		
		ArrayList<Employee> ar = new ArrayList<Employee>();
		ar.add(e1);
		ar.add(e2);
		
		/*
		 * for(int i=0;i<ar.size();i++) {
		 * 
		 * }
		 */

		//System.out.println(ar.get(0));
		
		Iterator<Employee> it = ar.iterator();
		while(it.hasNext()) {
			Employee next = it.next();
			System.out.println(next.age);
			System.out.println(next.dept);
			System.out.println(next.name);
		}
		
	}

}
