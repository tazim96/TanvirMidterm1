package datastructure;

import databases.ConnectToSqlDB;

import java.io.IOException;
import java.sql.*;
import java.util.*;


public class UseMap {

    public static void main(String[] args) throws SQLException {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         */

        Map<String, List<String>> map = new HashMap<String, List<String>>();


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


        //Retrieve with while loop and iterator
        System.out.println("Retrieve with while loop and iterator");
        Iterator<Map.Entry<String, List<String>>> it = b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, List<String>> x = it.next();
            System.out.println(x.getKey() + " " + x.getValue());
        }

        //Retrieve with For each Loop
        System.out.println("Retrieve with For each Loop");
        for (Map.Entry entry : b.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

}