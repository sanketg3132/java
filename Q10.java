
import java.util.Scanner;

public class Q10{

	public static void main(String... a){

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the temperature  ");
		
		int f=sc.nextInt();
	

		double 	C=(5*(f-32)/9);

		System.out.println("Fahrenheit to Celsius "+C);
	}
}