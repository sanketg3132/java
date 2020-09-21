
import java.util.Scanner;

public class Q30{

	public static void main(String... a){

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the row ");
		
		int n=sc.nextInt();

		System.out.println("Enter the col ");

		int n1=sc.nextInt();
		
		int arr[][]=new int[n][n1];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter the element");
				int n2=sc.nextInt();
				arr[i][j]=n2;	
			}
		}
		
		int sum=0;
		if(n%2==0)
		{
			for(int s=0;s<arr.length;s++)
			{
				sum+=arr[s][s];
				System.out.println(arr[s][s]+" ");
			}
		}
		else
		{
			for(int s=0;s<arr.length;s++)
			{
				if(n/2!=s)
				{
					sum+=arr[s][s];
					System.out.println(arr[s][s]+" ");	
				}
			}
		}
		int k=0;
		for(int d=arr.length-1;d>=0;d--)
		{
			sum+=arr[d][k];
			System.out.println(arr[d][k]+" ");	
			k++;
		}
		
		System.out.println("Sum of element "+sum);
	}
}