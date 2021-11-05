package Stream_All_Que;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class StreamDemo {

	public static void main(String[] args) {
		
		List<Fruit> fruitList = Arrays.asList(
				new Fruit("A", 150 , 10, "Red"),
				new Fruit("B", 60 , 30, "Blue"),
				new Fruit("C", 30 , 20, "Red"),
				new Fruit("D", 180 , 50, "Blue")
				);
		
		List<News> newsList = Arrays.asList(
				new News(1, "E" , "I", "Hello"),
				new News(2, "F" , "J", "Hiii"),
				new News(1, "F" , "K", "Thankyou"),
				new News(4, "H" , "L", "Welcome"),
				new News(4, "H" , "L", "Welcome")
				); 

		List<Trader> traderList = Arrays.asList(
				new Trader("M", "Q"),
				new Trader("N", "R"),
				new Trader("O", "S"),
				new Trader("P", "T")
				);
		
		List<Transaction> transactionList = Arrays.asList(
				new Transaction(traderList.get(0), 2000, 1000),
				new Transaction(traderList.get(1), 2001, 8000),
				new Transaction(traderList.get(2), 2002, 3000),
				new Transaction(traderList.get(3), 2003, 6000)
				);
		
		
		// First Question
		
		System.out.println("Stream First Question output");
		
		fruitList.stream().filter(l -> l.calories<100).forEach(l -> System.out.println(l.name));
		
	
		// Second Question 
		System.out.println("\n"+"Stream Second Question output");
		fruitList.stream().forEach(l -> {
			if(l.color.equals("Red")) {
				System.out.println(l.name + " is " + l.color);
			}else {
				System.out.println(l.name + " is " + l.color);
			}
			});
		 
		
		
		 //Fourth Question
		
		System.out.println("\n"+"Stream Second Question output");
		List<Integer> lst = new ArrayList<>();
		 
		for (Iterator iterator = newsList.iterator(); iterator.hasNext();) {
			News n = (News) iterator.next();
			 lst.add(n.newsId);
		}
		
		lst.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
	      .entrySet()
	      .stream()
	      .max(Map.Entry.comparingByValue())
	      .ifPresent(l-> System.out.println("News Id : "+ l.getKey() + " has the maxium comment i.e. :" + l.getValue()));
		 

		//Sixth Question
		System.out.println("\n"+"Stream six Question output");
		List<String> lsts = new ArrayList<>();
		 
		for (Iterator iterator = newsList.iterator(); iterator.hasNext();) {
			News n = (News) iterator.next();
			 lsts.add(n.commentByUser);
		}
		
		lsts.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
	      .entrySet()
	      .stream()
	      .max(Map.Entry.comparingByValue())
	      .ifPresent(l-> System.out.println("User Id : "+ l.getKey() + " has did the maximum comment i.e. :" + l.getValue()));
		

}

	 
}




class Fruit{
	String name;
	int calories;
	int price;
	String color;
	public Fruit(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}
	
	
}

class News{
	int newsId;
	String postedByUser;
	String commentByUser;
	String comment;
	public News(int newsId, String postedByUser, String commentByUser, String comment) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}
	
}

class Trader{
	String name;
	String city;
	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	
}

class Transaction{
	Trader trader;
	int year;
	int value;
	public Transaction(Trader trader, int year, int value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	
}
