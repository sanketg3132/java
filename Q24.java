
import java.util.Scanner;

public class Q24{

	public static void main(String... a){

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of arry ");
		
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Number ");
			int n1=sc.nextInt();
			arr[i]=n1;	
		}	
		System.out.println("Enter the Element to search in arry");
		int n2=sc.nextInt();
		int flag=0;
		for(int j=0;j<n;j++)
		{
			if(arr[j]==n2)
			{
				flag=1;
			}		
		}
		if(flag==1)
		{
			System.out.println(n2+" Element is present in arry");
		}
		else
		{
			System.out.println(n2+" Element is not present in arry");
		}
	}
}