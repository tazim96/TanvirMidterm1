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
		String string = "";
		String data = "";
		String saveLine = "";
		textFile = "C:\\Users\\Manju\\Desktop\\self-driving-car.txt";
		try {


			fr = new FileReader(textFile);
			br = new BufferedReader(fr);

			while ((string = br.readLine()) != null) {
				data = data + string;
				System.out.println(string);
			}


		} catch (FileNotFoundException e) {
			e.getStackTrace();
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			if (fr != null) {
				fr = null;
			}
			if (br != null) {
				br = null;
			}

		}


		String[] array = data.split(" ");
		List<String> list = new LinkedList<String>();
		Stack<String> myStack = new Stack<String>();

		for (String element : array) {
			list.add(element);
			myStack.push(element);
		}

		System.out.println("Stack:");
		while (!myStack.isEmpty()) {
			System.out.println(myStack.pop() + "  ");
		}

		System.out.println();

		System.out.println();

		System.out.println();


		System.out.println("LinkedList:");
		Iterator itr1 = list.iterator();

		while (itr1.hasNext()) {

			System.out.println(itr1.next());


		}


	}}



