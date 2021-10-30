package Exception_Handling_2;

import java.util.Scanner;

public class unSupExc {

	public static void main(String[] args) {
		
		 int a,b;
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter Dividend :");
		 a = sc.nextInt();
		 System.out.println("Enter Divisor :");
		 b = sc.nextInt();	
		
		try {		
			 name(a, b);	 
		} catch (UnsupportedOperationException e) {
			
			System.out.println("Error: "+e.getMessage());
			  
			if (e.getCause()!=null) {
				
				System.out.println("Cause by :"+ e.getCause());	
			}
		}		
	}
	
	 public static void name( int a, int b) throws UnsupportedOperationException {
	  
		 try {
			System.out.println(a/b);
		} catch (Exception e) {
			throw new UnsupportedOperationException("Exception:", e );
		} 
		 
	  } 
}
