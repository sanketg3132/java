
import java.util.Scanner;

public class Q26{

	public static void main(String... a){

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the row ");
		
		int n=sc.nextInt();
		
		int arr[][]=new int[n][];

		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the col of "+i+" row");
			int colsize=sc.nextInt();
			arr[i]=new int[colsize];
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter the element");
				int n2=sc.nextInt();
				arr[i][j]=n2;
				sum=sum+arr[i][j];	
			}
		}
		
		System.out.println("sum of element is "+sum);
	}
}