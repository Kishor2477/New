package learnfromfailures;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CreatingMap {

	public static void main(String[] args) {
		Map<Integer,String> hashMap = new HashMap<Integer,String>();
		hashMap.put(100, "Sathya");
		hashMap.put(200, "Viji");
		hashMap.put(300, "Hema");
		//Iteration
		
		/*
		 * for(Integer set : keySet) {
		 * 
		 * System.out.println(set.); }
		 */
		Iterator<Entry<Integer, String>> it = hashMap.entrySet().iterator();
		while(it.hasNext()) {
			Entry<Integer, String> entry = it.next();
		
			System.out.println(entry.getKey()+ ":"+entry.getValue());
		}
		Iterator<Integer> iterator = hashMap.keySet().iterator();
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			System.out.println("Key is "+ key +" & "+"Value is "+hashMap.get(key));
		}
		Set<Integer> keySet = hashMap.keySet();
		for(Integer key : keySet) {
			System.out.println(key + " : "+hashMap.get(key));
		}
	}
	

}
