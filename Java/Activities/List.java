package Activities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class List {

	public static void main(String[] args) {
		
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		linkedlist.add(1);
		linkedlist.add(2);
		linkedlist.add(3);
		linkedlist.add(4);
		linkedlist.add(4);

		
		System.out.println(linkedlist.get(4));
		//System.out.print(linkedlist.getLast());
		//System.out.print(linkedlist.remove(0));
		
		
		}
	}


