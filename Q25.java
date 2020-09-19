
import java.util.Scanner;

public class Q25{

	public static void main(String... a){

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of arry ");
		
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		int evensum=0;
		int oddsum=0;
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Number ");
			int n1=sc.nextInt();
			arr[i]=n1;
			if(n1%2==0)
			{
				evensum+=n1;	
			}
			else
			{
				oddsum+=n1;
			}	
		}
		
		System.out.println("sum of even no sum "+evensum+" sum of odd no sum "+oddsum);	
	}
}