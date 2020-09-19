
import java.util.Scanner;

public class Q8{

	public static void main(String... a){

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the principle amount rate of interest and time ");
		int amount=sc.nextInt();
		int rate=sc.nextInt();
		int time=sc.nextInt();
		
		double 	finalamount=(amount*(1+(rate*time)));

		System.out.println("Final amount "+finalamount);
	}
}