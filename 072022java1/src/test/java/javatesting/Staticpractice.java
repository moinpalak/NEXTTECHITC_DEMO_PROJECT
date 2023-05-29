package javatesting;

public class Staticpractice {
    static int A =1;
    static String Car="BMW";
    static void method1 ( String Firstname, String Lastname ) {
        System.out.println(Firstname+Lastname);	
    }
        static void fblogin(String email,String pw) {
        	System.out.println(email+pw);
        }
    
        
    public static void main(String[] args) {
        System.out.println(A);
        System.out.println(Car);
        method1("Mohammed","Islam");
        fblogin("mislam@gmail.com","abc4321");
        
		
		

	}

}
