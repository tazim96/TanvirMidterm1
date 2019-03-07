package datastructure;

import databases.ConnectToSqlDB;

import java.sql.Connection;
import java.util.*;

public class UseMap {

	public static void main(String[] args) throws java.lang.Exception {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		Map<Integer, String> borough = new HashMap<Integer, String>();
		borough.put(1, "BK");
		borough.put(2, "BX");
		borough.put(3, "SI");

		String var = borough.get(2);
		System.out.println("The value of index 2 is: " + var);



		List<String> cityOfUSA = new ArrayList<String>();
		cityOfUSA.add("New York");
		cityOfUSA.add("Los Angeles");
		cityOfUSA.add("Chicago");

		List<String> cityOfChina = new ArrayList<String>();
		cityOfChina.add("Shanghai");
		cityOfChina.add("Honk Kong");
		cityOfChina.add("Beijing");

		List<String> cityOfCanada = new ArrayList<String>();
		cityOfCanada.add("Toronto");
		cityOfCanada.add("Vancouver");
		cityOfCanada.add("Montreal");

		Map<String, List<String>> b = new HashMap<String, List<String>>();
		b.put("United States", cityOfUSA);
		b.put("China", cityOfChina);
		b.put("Canada", cityOfCanada);

		//While loop and iterator
		System.out.println("Retrieve with while loop and iterator");
		Iterator<Map.Entry<String, List<String>>> it = b.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, List<String>> i = it.next();
			System.out.println(i.getKey() + " " + i.getValue());
		}

		//For each Loop
		System.out.println("Retrieve with For each Loop");
		for (Map.Entry entry : b.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();


		connectToSqlDB.createTableFromStringToMySql("tbl_map", "mapKey", "mapValue");
		for (Object str : b.keySet()) {
			for (String str1 : b.get(str)) {
				List<String> list1 = new ArrayList<String>();
				list1.add(str.toString());
				list1.add(str1);
				connectToSqlDB.InsertDataFromArrayListToMySql(list1, "tbl_map", "mapKey", "mapValue");
			}
		}


		List<String> numbers = (List<String>) connectToSqlDB.readDataBase("tbl_map", "mapKey");

		for (String st : numbers) {
			System.out.println(st);
	}

}}
