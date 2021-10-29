package AssignmentOne;

public class Second {

	public static void main(String[] args) {
		 
		int from=100;
		int upto = 999;
		 
		for (int i=from; i<=upto;i++) {
			
			int temp = i;
			int	total=0;
			while (temp > 0) {	    
			    int sn = (temp % 10);
			    temp = temp / 10;
			    total = total+(sn*sn*sn);
			}

			if(total==i) {
				System.out.println(" " + i);
			}
			total=0;
		}
	   
	}

}
