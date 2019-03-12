package datastructure;

import databases.ConnectToSqlDB;

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
		List<Integer> list = new ArrayList<Integer>();

		list.add(23);
		list.add(24);
		list.add(47);
		list.add(25);
		list.add(73);
		list.add(38);
		list.add(90);
		list.add(29);

		System.out.print(list);
		System.out.println();

		list.remove(5);

		System.out.println(list);
		System.out.println();

		Iterator<Integer> itr = list.iterator();

		while(itr.hasNext()){
			System.out.println("value= " + itr.next());


		}

		System.out.println();
		ConnectToSqlDB conn = new ConnectToSqlDB();
		conn.insertIntFromArrayListToSqlTable(list, "ArrayList", "Values");



	}

}