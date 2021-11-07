package Java_11_5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class MenuDemo {

	public static void main(String[] args) {
		var path1="C:\\Users\\nkawadka\\git\\repository\\JavaAssignmenta\\Assignments\\src\\Java_11_5\\File1.txt";
		var path2="C:\\Users\\nkawadka\\git\\repository\\JavaAssignmenta\\Assignments\\src\\Java_11_5\\File2.txt";
		int ch,price,totalPrice=0;
		boolean isTrue=true;
		Scanner sc=new Scanner(System.in);
		Boolean selected = true;
		while(isTrue) {
			System.out.println("Enter Option (1.Insert new ,2.view purchase total ,3.Exit)");
			ch=sc.nextInt();
			
			if(ch == 1) {
				int yN;
				while (selected) {
	
				try {
					System.out.println("Insert price :");
					price=sc.nextInt();
					Files.writeString(Path.of(path1),Integer.toString(price)+"\n", StandardOpenOption.APPEND);
					totalPrice +=price;
					Files.writeString(Path.of(path2),Integer.toString(totalPrice)+"\n", StandardOpenOption.CREATE);
					
				}catch(IOException e){
					e.printStackTrace();
				}
				System.out.println("Do you want to enter price for more item : ");
				  yN = sc.nextInt();
				sc.nextLine();
				if (yN == 0) {
					selected = false;
				}
				}
			}else if (ch==2) {
				try {
					String data=Files.readString(Path.of(path2));
					System.out.println(data);
					
				}catch(IOException e){
					e.printStackTrace();
				}
			}else if (ch == 3) {
				System.out.println("Exit...");
				isTrue=false;
				break;
			}
	
		}

	}

}
