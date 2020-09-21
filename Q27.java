
import java.util.*;

public class Q27{

	public static void main(String... a){

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of arry ");
		
		int n=sc.nextInt();
		
		int arr[]=new int[n];

		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Element ");
			int n1=sc.nextInt();
			arr[i]=n1;
		}
		
		Arrays.sort(arr);
		
		System.out.println("Smallest Element is "+arr[0]);
		System.out.println("Gretest Element is "+arr[n-1]);
		
	}
}