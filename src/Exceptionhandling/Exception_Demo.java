package Exceptionhandling;

public class Exception_Demo {

	public static void main(String[] args) {
		
        int a=10;
        try 
        {
        System.out.println("hello");
        int res=a/0;
        System.out.println(res);
        System.out.println("hie");
        }
        catch( ArithmeticException e) {
        	System.out.println(e);
            System.out.println("Try again");

        }
        catch (Exception e) {
         System.out.println(e);
        }
		
		System.out.println("java");
	}

}
