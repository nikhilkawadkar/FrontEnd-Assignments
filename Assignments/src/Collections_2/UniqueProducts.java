package Collections_2;

 
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class UniqueProducts {

	public static void main(String[] args) {
		 
		Products product1 = new Products("A");
		Products product2 = new Products("B");
		Products product3 = new Products("C");
		
		Set<Products> unique = new TreeSet<>();
		
		unique.add(product1);
		unique.add(product2);
		unique.add(product3);
		
		unique.add(product1); //Try to add duplicate object it get replaced with the Similar one
		
		  Iterator<Products> i= unique.iterator();  
	         while(i.hasNext())  
	         {  
	             System.out.println(i.next().name);  
	         }  

	}

}
//String and Wrapper classes are Comparable by default. To add user-defined objects
//in TreeSet, you need to implement the Comparable interface.

class Products implements Comparable<Products>{
	
	String name;

	public Products(String name) {
		super();
		this.name = name;
	}

	@Override
	public int compareTo(Products o) {
		  
		if (name.compareTo(o.name)>0) {
            return 1;
        }
        else if (name.compareTo(o.name)<0) {
            return -1;
        }
        else {
            return 0;
        } 
	}	
}