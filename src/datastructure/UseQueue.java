package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> fruits=new LinkedList<String>();
		fruits.add("Orange");
		fruits.add("Mango");
		fruits.add("Jackfruit");
		fruits.add("Apple");
		fruits.remove("");
		fruits.peek();
		fruits.poll();

		Iterator it=fruits.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

		for(String fruit: fruits){
			System.out.println("Remove names: "+fruits.remove()+" Peek Names: "+fruits.peek()+" Pool Names: "+fruits.poll());
		}
	}
}
