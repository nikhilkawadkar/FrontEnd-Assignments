package AssignmentOne;

public class Fourth {

	public static void main(String[] args) {
		 
		int a=61,b=70,c=80;
		result(a, b, c);
	}
	
	public static void result(int a,int b, int c) {
		int passIn=0;
		 if (a>60) {
			passIn++;
		}  
		if(b>60){
			passIn++;
		}
		if(c>60) {
			passIn++;
		}
		 if(passIn<2) {
			 System.err.println("Failed");
		 }else if(passIn==2) {
			 System.out.println("Promoted");
		 }else if(passIn == 3) {
			 System.out.println("Passed");
		 }
		 
	}

}


