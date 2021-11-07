package Lambda_4;

import java.util.ArrayList;
import java.util.List;

public class SortingOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<String> str = new ArrayList<>();
			
			str.add("nikhil");
			str.add("sai");
			str.add("Piyush");
			str.add("Yash");
			
			str.removeIf(l -> l.length()%2 !=0);
			
			System.out.println(str);
			
	}

}


 