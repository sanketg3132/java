
import java.util.Scanner;

public class Q9{

	public static void main(String... a){

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the days ");
		
		int days=sc.nextInt();

		int year=days/365;
		
		int days2=days%365;
		 
		int months=days2/30;

		int days3=days2%30;
		
		System.out.println(year+" years "+months+" months "+days3+" days ");
		    
	}
}