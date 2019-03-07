package datastructure;

import databases.ConnectToSqlDB;

import java.util.*;

public class UseArrayList {

	public static void main(String[] args)throws java.lang.Exception {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		int limit = 10;
		ArrayList<Integer> alist1=new ArrayList<Integer>();

		Random random = new Random();
		for(int i=0; i<limit; i++){
			alist1.add(random.nextInt(100));
		}
		for(int j=0; j<alist1.size(); j++){

			System.out.print(alist1.get(j)+" , ");
		}
		System.out.println();

		System.out.println("ArrayList size before remove :"+alist1.size());

		alist1.remove(0);
		alist1.remove(1);
		System.out.println("ArrayList size after remove :"+alist1.size());

		System.out.println("Re-retrieving elements from ArrayList: " + alist1);

		Collections.sort(alist1);
		System.out.println("Sorting ArrayList :"+alist1);

		System.out.println("Retrieve with for loop");
		for (int i = 0; i < alist1.size(); i++) {
			System.out.print(alist1.get(i)+" , ");
		}
		System.out.println();

		System.out.println("Retrieve with while loop and iterator");
		Iterator it = alist1.listIterator();
		while(it.hasNext()){
			System.out.print(it.next()+" , ");
		}
		System.out.println();

		//Retrieve with For each loop
		System.out.println("Retrieve with For each loop");
		for(Integer str:alist1)
			System.out.print(str+" , ");
		System.out.println();

		ArrayList alist2= new ArrayList();
		alist2=alist1;


		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

		connectToSqlDB.insertDataFromArrayListToSqlTable(alist2,"tbl_arrayList", "column_lowestNumber");
		List<String> numbers = connectToSqlDB.readDataBase("tbl_arrayList", "column_lowestNumber");
		for(String st:numbers){
			System.out.println(st);
		}

	}

}

