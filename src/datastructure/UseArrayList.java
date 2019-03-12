package datastructure;

import databases.ConnectToSqlDB;

import java.sql.SQLOutput;
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
		List<Integer> num = new ArrayList<Integer>();
		num.add(77);
		num.add(23);
		num.add(14);
		num.add(10);
		num.add(50);
		num.add(13);
		num.add(90);
		num.add(33);



		System.out.print(num);
		System.out.println();


		num.remove(2);
		num.remove(5);

		System.out.println(num);

		int peek = num.get(0);
		System.out.println("The peek is : " + peek);


		Iterator<Integer> itr = num.iterator();

		while(itr.hasNext()){
			System.out.println("num: " + itr.next());


		}

		System.out.println();

	}

}