
import java.util.Scanner;

public class Q28{

	public static void main(String... a){

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of arry ");
		
		int n=sc.nextInt();
		
		String arr[]=new String[n];

		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the String ");
			String n1=sc.next();
			arr[i]=n1;
		}
		
		for(String j : arr)
		{
			System.out.print(" "+j);
		}
		
	}
}