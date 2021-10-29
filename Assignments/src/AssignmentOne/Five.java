package AssignmentOne;

public class Five {

	public static void main(String[] args) {
		 double ctc = 400000;
		 
		 if(ctc<180000) {
			 System.out.println("No tax");
		 }else if(ctc>180000 && ctc < 300000) {
			 System.out.println((ctc*10)/100);
		 }else if(ctc>300000 && ctc < 500000) {
			 System.out.println((ctc*20)/100);
		 }else if(ctc>500000 && ctc < 1000000) {
			 System.out.println((ctc*30)/100);
		 }

	}

}
