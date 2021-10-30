package Exception_Handling_1;

import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		 int a,b;
		 Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter Dividend :");
		a = sc.nextInt();
		System.out.println("Enter Divisor :");
		b = sc.nextInt();
		
		
		
		try {
			System.out.print("Ans : "+(a/b));
		} catch (ArithmeticException e) {
			 System.out.println("Error :  "+e.getMessage());
		}
		
		
		
	}

}
