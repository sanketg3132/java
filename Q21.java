
import java.util.Scanner;

public class Q22{

	public static void main(String... a){

		Scanner sc=new Scanner(System.in);
		
		int arr[]=new int[10];
		int sum=0;
		int avg=0;
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter the Number ");
			int n=sc.nextInt();
			arr[i]=n;
			sum=sum+n;	
		}	
		 avg=sum/10;
		System.out.println("sum of Number "+sum);
		System.out.println("avg of Number "+avg);  
	}
}