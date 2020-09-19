
import java.util.Scanner;

public class Q23{

	public static void main(String... a){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of arry ");
		
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Number ");
			int w=sc.nextInt();
			arr[i]=w;	
		}	
		int n1=0;
		int n2=n-1;
		int s=(n/2+1);
		while(n1!=s)
		{
			int temp=arr[n1];
			arr[n1]=arr[n2];
			arr[n2]=temp;
			n1++;
			n2--;	
		}
		System.out.println("rev arry ");
		for(int h=0;h<n;h++)
		{
			System.out.print(arr[h]+" ");
		}
	}
}