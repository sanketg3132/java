
import java.util.Scanner;
import java.util.Arrays;

public class Q22{

	public static void main(String... a){

		Scanner sc=new Scanner(System.in);
		
		int arr[]=new int[10];
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter the Number ");
			int n=sc.nextInt();
			arr[i]=n;
				
		}	
		Arrays.sort(arr);
		for(int j=9;j>0;j--)
		{
			System.out.println(arr[j]);
		}
	}
}