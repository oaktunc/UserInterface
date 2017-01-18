import java.util.*;
public class DivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int a = 1, b = 1;
		
		try{
		System.out.println("Enter a");
		a = s.nextInt();
		
		System.out.println("Enter b");
		b = s.nextInt();
		
		
		System.out.println(a / b);
		}
		
		
		catch(InputMismatchException | ArithmeticException e) {
			System.out.println(e.getMessage() + " exception");
			System.out.println("Please do not enter 0 for b");
			System.out.println("Reenter b");
			b = s.nextInt();
			System.out.println(a / b);
		}
		
		
		
		
		s.close();
		
		

	}
	
	public static void methodA(int a, int b) {
		methodB(a, b);
	}
	public static void methodB(int a, int b) {
		try{
		System.out.println(a / b);
		}
		catch(Exception e) {
			System.out.println(e.getMessage() + " exception");
			System.out.println("Please do not enter 0 for b");
			
		}
	}
	
	

}
