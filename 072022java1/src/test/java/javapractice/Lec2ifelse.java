package javapractice;

public class Lec2ifelse {

	public static void main(String[] args) {
		/* syntax of if statement
		 if (condition) {
 // block of code to be executed if the condition is true
}
		 */
		
		if(99>69) {
		System.out.println("99 is greater than 69");	
		}

		int x=10;
		int y=5;
		
		//if statement
		if(x>y) {
			System.out.println("x is greater then y");
		}
		
		int time=24;
		
		if(time<12) {
			System.out.println("good morning");
		}
		
		else if (time<17) {
			System.out.println("good afternoon");
		}
		
		else if (time<22) {
			System.out.println("good evening");
		}
		
		else {
			System.out.println("good night");
			
		}
		
		
		
	}

}
