package javapractice2;

public class Lec6accessmod {
    
	int num=1; //used default acces modifire= accessible in the any class of same package
	
	public String flower="rose"; // public access modifier accessible in any class of any packages
	
	//METHOD SYNTAX : accessmodifier returntype meethod name(argument1, arg2){}
	
	public void fblogin(String email, String PW) {
	    //block of code	
	}
	
	void method1() {
		//block of code
		System.out.println("this is a method");
	}
	//protected to access any protected attribute and method we have to use extends keyword 
	//means we have to use inheritance concept
	protected int number=10;
	protected void method3(){
		System.out.println("nexttechitc");
	}
	
    public static void main(String[] args) {
		Lec6accessmod obj=new Lec6accessmod();//create obj
	System.out.println(obj.flower);	

	}

}
