
import java.util.Scanner;

public class Q20{

	public static void main(String... a){

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number ");
		
		int n=sc.nextInt();
		int n2=sc.nextInt();

		for(int i=n;i<n2;i++)
		{
			int count=0;
			for(int j=2;j<i;j++)
			{
				if(i%j == 0)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println(i);
			}
		}	
		    
	}
}