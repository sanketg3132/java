

import java.util.Scanner;

public class Q11{

	public static void main(String... a){

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter numbres ");
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();

		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;

		System.out.println(num1+" "+num2);
	}
}