package Collections_3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
 

public class PrintSorted {

	public static void main(String[] args) {
		 Employee emp1 = new Employee(1, "Nikhil", "A", 20000L);
		 Employee emp2 = new Employee(3, "Piyush", "D", 50000L);
		 Employee emp3 = new Employee(2, "Arjun", "C", 30000L);
		 Employee emp4 = new Employee(4, "Kunal", "B", 70000L);
		 
		 System.out.println("Enter a to sort according to id "+"\n"+"Enter b to sort according to Name "
		 +"\n"+"Enter c to sort according to department "+"\n"+"Enter d to sort according to Salary ");
		 Scanner sc = new Scanner(System.in);
		 String ch = sc.nextLine();
				 
		 
			Set<Employee> set = new TreeSet<Employee>(new CustomSort(ch));
			
			set.add(emp1);
			set.add(emp2);
			set.add(emp3);
			set.add(emp4);
			 
			Iterator<Employee> i= set.iterator();  
	         while(i.hasNext())  
	         {  
	             System.out.println(i.next());  
	         }  
		 
	         sc.close();
	}

}


class Employee {
	
	int id;
	String name;
	String dept;
	long salary;
	public Employee(int id, String name, String dept, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	 
	
}

class CustomSort implements Comparator<Employee>{
	
	String a;

	public CustomSort(String a) {
		super();
		this.a = a;
	}


	@Override
	public int compare(Employee o1, Employee o2) {
		
		if(a.equalsIgnoreCase("a")) {
			return o1.id-o2.id;
		}else if(a.equalsIgnoreCase("b")) {
			return o1.name.compareTo(o2.name);
		}else if(a.equalsIgnoreCase("c")) {
			return o1.dept.compareTo(o2.dept);
		}else if(a.equalsIgnoreCase("d")) {
			
			if (o1.salary>o2.salary) {
	            return 1;
	        }
	        else if (o1.salary<o2.salary) {
	            return -1;
	        }
	        else {
	            return 0;
	        } 
		}
		return 0;	
	}	
}
