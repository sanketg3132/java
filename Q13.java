
import java.util.Scanner;

public class Q13{

	public static void main(String... a){

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Numbers  ");
		
		int num1=sc.nextInt();
		
		int num2=sc.nextInt();

		int num3=sc.nextInt();
		
		int ans=(num1>num2 && num1>num3)? num1:(num2>num3 && num2>num1) ? num2:num3;
		
		System.out.println("Greter no is "+ans);
	}
}