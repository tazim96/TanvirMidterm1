package datastructure;

import databases.ConnectToSqlDB;
import jdk.nashorn.internal.runtime.regexp.joni.constants.Traverse;

import java.io.*;
import java.sql.*;
import java.util.*;

public class DataReader {

	public static void main(String[] args) throws Exception {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class.
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";

		FileReader fr = null;
		BufferedReader br = null;
		String line;
		String saveLine = "";
		String path = "C:\\Users\\Manju\\Desktop\\self-driving-car.txt";
		try {

			fr = new FileReader(path);
			br = new BufferedReader(fr);


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {

			while ((line = br.readLine()) != null) {

				System.out.println(line);
				saveLine += line;

			}
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			if (fr != null) {

				fr = null;
			}
			if (br != null) {

				br = null;
			}
		}



		String[] saveArray = saveLine.split(" ");

		Stack<String> myStack = new Stack<>();
		List<String> myList = new ArrayList<>();

		for(String element : saveArray){

			myStack.push(element);
			myList.add(element);

		}

;

		System.out.println("Stack:");
		while(!myStack.isEmpty()){
			System.out.println(myStack.pop() + "  ");
		}

		System.out.println();

		System.out.println();

		System.out.println();


		System.out.println("LinkedList:");
		Iterator itr1 = myList.iterator();

		while(itr1.hasNext()){

			System.out.println(itr1.next());

		}








	}



}