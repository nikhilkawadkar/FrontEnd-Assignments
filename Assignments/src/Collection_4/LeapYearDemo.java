package Collection_4;

import java.time.LocalDate; 
import java.time.format.DateTimeFormatter; 
import java.util.LinkedList;
import java.util.List;
 
public class LeapYearDemo {

	public static void main(String[] args) {
		
		DateDemo date = new DateDemo("10/10/1999");
		DateDemo date1 = new DateDemo("10/10/2000");
		DateDemo date2 = new DateDemo("01/10/2001");
		DateDemo date3 = new DateDemo("10/10/2002");
		DateDemo date4 = new DateDemo("10/10/2003");
		DateDemo date5= new DateDemo("10/10/2004");
		DateDemo date6 = new DateDemo("10/10/2005");
		
		List<DateDemo> dobList = new LinkedList<>();
		dobList.add(date);
		dobList.add(date1);
		dobList.add(date2);
		dobList.add(date3);
		dobList.add(date4);
		dobList.add(date5);
		dobList.add(date6);
		 
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		for (int i = 0; i < dobList.size(); i++) {
			
			LocalDate ld= LocalDate.parse(dobList.get(i).date,df);
			String sd=(ld).format(df);
			  
			if(ld.getYear() % 4 == 0) {
				System.out.println(sd + " is an leap year");
			}else {
				System.out.println(sd + " is not an leap year");
			}
		}
		
	}
}


class DateDemo {
	
	String date;
	
	public DateDemo(String date) {
		super();
		this.date = date;
	}

	@Override
	public String toString() {
		return "[date=" + date + "]";
	}

	public String getDate() {
		return date;
	}
 
}

