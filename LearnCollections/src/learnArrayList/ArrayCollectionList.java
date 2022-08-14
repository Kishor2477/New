package learnArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayCollectionList {

	public static void main(String[] args) {

		ArrayList<String> studentList = new ArrayList<String>();
		studentList.add("new");
		studentList.add("old");
		studentList.add("alea");

		System.out.println(studentList);

		System.out.println("====================");

		// For loop
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println(studentList.get(i));
		}
		System.out.println("====================");
		// for each loop
		for (String s : studentList) {
			System.out.println(s);
		}
		System.out.println("====================");

		// iterator
		Iterator<String> iterator = studentList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("====================");
		// for each stream

		studentList.stream().forEach(ele -> System.out.println(ele));

	}

}
