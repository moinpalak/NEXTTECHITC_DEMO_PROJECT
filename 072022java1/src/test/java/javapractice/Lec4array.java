package javapractice;

public class Lec4array {

	public static void main(String[] args) {
		//java collections - array, arraylist, hashmap =store multiple data in single variable
		//Array is fixed you cannot add or delete any data
		//store single data in single variable
		
		   int num=1;
		   int num2=3;
		   String name="nayeem";
		   //Array
		   // datatype[] variable={"value1","value2"..."value n"}
		   String []cars= {"bmw","nissan","honda"};
		   //store 5 state name by using array
		   String []state= {"Fl","Tx","Ny","OH","Co"};
		   //store 5 whole number
		   // datatype[] variable={"value1","value2"..."value n"}
		   int[]numbers= {10,20,30,40,50};
		   
		   //how to access the data/value
		   //access value 30
		   System.out.println(numbers[2]);
		   
		   System.out.println(numbers[0]);
		   //store months
		   String[]months= {"Jan","Feb"};
		   System.out.println(months[1]);
		   System.out.println(months[2]="april");
		   
		   //how to change value
		   //Fruits [0] ="jackfruit";
		   
		   //how to check length
		   
		   System.out.println(months.length);
		   
		   
		   
		   
		   
	}

}
