
import java.util.Scanner;

public class Q14{

	public static void main(String... a){

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Years  ");
		
		int year=sc.nextInt();
		
		if(year%4==0)
		{
			System.out.println(year+" year is leep year");
		}
		else
		{
			System.out.println(year+" year is not leep year");
		}
		    
	}
}