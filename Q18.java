
import java.util.Scanner;

public class Q18{

	public static void main(String... a){

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number ");
		
		int n=sc.nextInt();

		int count=0;
		for(int i=2;i<n;i++)
		{
		
			if(n%i == 0)
			{
				count++;	
			}	
		}
		if(count==0)
			{
				System.out.println("Prime no");
			}
			else
			{
				System.out.println("Not Prime no");
			}		
		    
	}
}