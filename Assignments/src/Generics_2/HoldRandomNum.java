package Generics_2;

import java.util.HashMap;

public class HoldRandomNum {

	public static void main(String[] args) {
		 
		HashMap<Integer, Double> randomValues = new HashMap<>();
		
		randomValues.put(1, 10.0);
		randomValues.put(2, 20.0);
		randomValues.put(3, 30.0);
		randomValues.put(4, 40.0);
		randomValues.put(5, 50.0);
		randomValues.put(6, 60.0);
		randomValues.put(7, 70.0);
		randomValues.put(8, 80.0);
		randomValues.put(9, 90.0);
		randomValues.put(10, 100.0);
		
		System.out.println(randomValues);
		
		
	}

}
