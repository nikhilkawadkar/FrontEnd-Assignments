package Collections_1;

import java.util.Collections;
import java.util.Map;

//import java.text.CollationElementIterator;
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//import java.util.Map;
//import java.util.Map.Entry;
//import java.util.Set;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		 
		Contact obj1 = new Contact( 9020304050L, "Nikhil" , "nk@gmail.com" , "Male");
		Contact obj2 = new Contact( 9768595385L, "Piyush" , "pk@gmail.com" , "Male");
		Contact obj3 = new Contact( 9020367494L, "Chaitali" , "ck@gmail.com" , "Female");

		Map<Long, Contact> data = new TreeMap<Long, Contact>(Collections.reverseOrder());
		//the treemap by default keeps the key sorted in ascending 
		//so to sort in descending order we have to pass Collections.reverseOrder() to the constructor
		
		data.put(1234L, obj1);
		data.put(123456780L, obj2);
		data.put(1238244L, obj3);
	 	 
		 System.out.println("Keys : "+data.keySet() + "\n");
		 System.out.println("Values : " + data.values() + "\n");
		 System.out.println(data + "\n");
		 
	}

}






//to sort the Maps

//System.out.println("Before Sortingin descending order of Phone no.: "+ data.keySet());
// 
// Set<java.util.Map.Entry<Long, Contact>> contactSet = data.entrySet();
// 
// List<Entry<Long, Contact>> contactList = new ArrayList<>(contactSet);
// 
// Collections.sort(contactList, new Comparator<Entry<Long, Contact>>() {
//
//	@Override
//	public int compare(Entry<Long, Contact> o1, Entry<Long, Contact> o2) {
//		 
//		
//		return o1.getKey().compareTo(o2.getKey());
//	}
//});
