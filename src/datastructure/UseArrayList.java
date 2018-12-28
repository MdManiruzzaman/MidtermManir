package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		List<String> list = new ArrayList<String>();
		list.add("Fruits");
		list.add("Animals");
		list.add("Countries");
		list.remove(1);

		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

		for (String M : list) {
			System.out.println("Listed Names are :" + M);
		}
	}
}
