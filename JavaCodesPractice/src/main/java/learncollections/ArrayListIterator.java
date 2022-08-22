package learncollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		
		ArrayList<String> ht = new ArrayList<String>();
		ht.add("one");
		ht.add("two");
		ht.add("three");
		ht.add("four");
		
		//1.Simple for loop
		System.out.println("========================");
		for(int i=0;i<ht.size();i++) {
			System.out.println(ht.get(i));;
		}

		//2.Using Advance for loop
		System.out.println("========================");
		for(String s : ht) {
			System.out.println(s);
		}
		
		//3.Using Iterator
		System.out.println("========================");
		Iterator<String> it = ht.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//4 using for each lamda method
		System.out.println("========================");
		it = ht.iterator();
	    it.forEachRemaining(shows -> {
	    	System.out.println(shows);
	    });
	    
	    System.out.println("========================");
	    ht.forEach(shows ->{
	    	System.out.println(shows);
	    });
	    System.out.println("========================");
	   ListIterator<String> listIterator = ht.listIterator(ht.size());
	   while(listIterator.hasPrevious()) {
		   System.out.println(listIterator.previous());
		   
			
			  System.out.println("=======================================+");
			  Iterator<String> iterator = ht.iterator(); while(iterator.hasNext()) {
			  System.out.println(iterator.next()); }
			 
	   }
	}

}
