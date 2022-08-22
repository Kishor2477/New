package learncollections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LearnHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Naveen");
		hm.put(2, "Vasan");
		
		for(Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
			
		}
		
		HashMap<Integer, Employee> hm1 = new HashMap<Integer, Employee>();
		
		Employee e1 = new Employee("Gokul", "Mech", 27);
		Employee e2 = new Employee("Naresg","CS",27);
		
		hm1.put(3, e1);
		hm1.put(4, e2);
		
		Set<Entry<Integer, Employee>> entrySet = hm1.entrySet();
		for(Entry<Integer,Employee> entry : entrySet) {
			Integer key = entry.getKey();
			Employee value = entry.getValue();
			System.out.println("The Value for "+key + " is");
			System.out.println(value.name + " "+value.age +" " + value.dept);
		}
//hm.putAll(hm1);
		
	}

}
