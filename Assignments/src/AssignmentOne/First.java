package AssignmentOne;

public class First {

	public static void main(String[] args) {
		
		int num =153;
		int numCp = num;
		int	total=0;

		while (num > 0) {	    
		    int sn = (num % 10);
		    num = num / 10;
		    total = total+(sn*sn*sn);
		}
			 
		 System.out.println(total==numCp ? numCp +" Is armstrong": numCp +" Not an Armstrong");	 
	}

}
