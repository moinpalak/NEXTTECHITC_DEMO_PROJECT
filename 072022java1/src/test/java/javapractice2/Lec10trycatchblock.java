package javapractice2;

public class Lec10trycatchblock {

	//exception in java : exception means code error . to handle exception we use try and catch block
	public static void main(String[] args) {
	try {
		//block of code
		int[] Numbers = {1,2,3};
		System.out.println(Numbers[2]);
	}
	
	catch(Exception e) {
		//we handle the exception . we write a message here
		System.out.println("code in Array fail");
	}
	}

	}
