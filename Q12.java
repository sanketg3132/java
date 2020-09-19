
import java.util.Scanner;

public class Q12{

	public static void main(String... a){

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter basic salary of employee ");
		
		double salary=sc.nextInt();
		double HRA;
		double DA;
		double GS;

		if(salary<10000)
		{
		     HRA=(0.1*salary);
		     DA=(0.9*salary);
		     GS= salary + DA + HRA;   
		}
		else
		{
		     HRA=2000;
		     DA=((98/100)*salary);
		     GS= salary + DA + HRA;   
		}

		System.out.println("HRA of emplyee "+HRA);
		System.out.println("DA of emplyee "+DA);
		System.out.println("GS of emplyee "+GS);
	}
}