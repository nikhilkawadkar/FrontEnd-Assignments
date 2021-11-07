package Lambda_1;

public class ArithmaticOperations {

	public static void main(String[] args) {
		
		int a=10;
		int b=2;
		 
		Arithmatic add = (c,d) -> System.out.println("Addition : " + (c+d));
		Arithmatic substract = (c,d) -> System.out.println("Substract : " + (c-d));
		Arithmatic multiply = (c,d) -> System.out.println("Multiply : " + (c*d));
		Arithmatic division = (c,d) -> System.out.println("Division : " + (c/d));

		add.calculation(a, b);
		substract.calculation(a, b);
		multiply.calculation(a, b);
		division.calculation(a, b);
	}

}


interface Arithmatic{
	public void calculation(int a,int b);
}