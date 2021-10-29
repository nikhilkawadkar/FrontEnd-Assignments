package AssignmentOne;

public class Third {

	public static void main(String[] args) {
		 int principle=5000;
		 int rate = 5;
		 int years = 5;
		 float inter=0;
		 int simpleInterest = (principle*rate*years)/100;
		 System.out.println(simpleInterest);
		  float CI = principle;
         for (int i = 0; i < years; i++) {
        	 float si=(CI*rate)/100;
        	 inter = inter +si;
        	 CI= CI+si;
		}
         System.out.println(inter);
		 
	}

}
