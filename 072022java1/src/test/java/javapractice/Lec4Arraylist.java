package javapractice;

import java.util.ArrayList;

public class Lec4Arraylist {

	public static void main(String[] args) {
		//Arraylist is not fixed we can add or remove data as much as we can
//syntax:Arraylist <datatype> variable name=new Arraylist<datatype>();
		ArrayList<String> Sportscars = new ArrayList<String>();// Create an Arraylist object
		//add 3 Sportscars in Arraylist
		Sportscars.add("Nissan");
		Sportscars.add("BMW");
		Sportscars.add("jeep");
		//how to access value in Arraylist
		
		//how to change value
		Sportscars.set(1,"Bentley");
		System.out.println(Sportscars.get(1));
		//store any 3 int value by using array list
        ArrayList<Integer> num= new ArrayList<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);
        
        

	}

}
