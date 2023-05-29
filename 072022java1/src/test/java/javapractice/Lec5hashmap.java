package javapractice;

import java.util.HashMap;

public class Lec5hashmap {

	public static void main(String[] args) {
		//HashMap<datatype,datatype> variable name=new HashMap <datatype,datatype>();
		//store 3 city name of TX state
		HashMap<String, String> capital =new HashMap<String, String>();
		capital.put("TX", "Irving");
		capital.put("TX", "Dallas");
		capital.put("tx", "plano");
		capital.put("NY", "Queens");
		capital.put("NY", "Brooklyn");
		
		//remove
		capital.remove("NY");
		System.out.println(capital);
		
		//create 3 student names and IDs
		HashMap<String, String> student =new HashMap<String, String>();
		student.put("Palak", "101");
		student.put("Roney", "102");
		student.put("Lou", "103");
		
		System.out.println(student);
		
		
		
		
		

	}

}
