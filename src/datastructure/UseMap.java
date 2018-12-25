package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		List<String> Australia=new ArrayList<String>();
		Australia.add("Sydney");
		Australia.add("Melbourne");
		Australia.add("Perth");

		List<String>USA=new ArrayList<String>();
		USA.add("NYC");
		USA.add("NJ");
		USA.add("FL");

		List<String>Canada=new ArrayList<String>();
		Canada.add("Toronto");
		Canada.add("Montreal");
		Canada.add("Vencuver");

		Map<String, List<String>> listOfCities = new HashMap<String, List<String>>();
		listOfCities.put("Cities of Australia: ", Australia );
		listOfCities.put("Cities of USA: ",USA);
		listOfCities.put("Cities of Canada: ", Canada);

		Iterator it=listOfCities.entrySet().iterator();

		while(it.hasNext()){
			System.out.println(it.next());

		}
		for(Map.Entry<String,List<String>> cityInfo:listOfCities.entrySet()){
			System.out.println("\n"+cityInfo.getKey()+" "+cityInfo.getValue());
		}
	}

}
