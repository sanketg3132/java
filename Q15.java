
import java.util.Scanner;

public class Q15{

	public static void main(String... a){

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the gender ");
		
		char gender=sc.next().charAt(0);
		
		System.out.println("Enter the age ");

		int age=sc.nextInt();
		
		if((gender=='m' || gender=='f' || gender=='M' || gender=='F') && age>21)
		{
			System.out.println("eligible for marriage");
		}
		else
		{
			System.out.println("not eligible for marriage");
		}
		    
	}
}