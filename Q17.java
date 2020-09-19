
import java.util.Scanner;

public class Q17{

	public static void main(String... a){

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number ");
		
		int n=sc.nextInt();
		int rem=0;
		int sum=0;
		while(n!=0)
		{
			rem=(n%10);
			sum=((10*sum)+rem);
			n=n/10;				
		}
		
		System.out.println(sum);
		    
	}
}