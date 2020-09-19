
import java.util.Scanner;

public class Q6{

	public static void main(String... a){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the redius of circule");
		int redius=sc.nextInt();
		int Rpow=(redius*redius);
		double area=(3.14*Rpow);
		double circumference=(2*3.14*Rpow);
		System.out.println("area of circule "+area);
		System.out.println("circumference of circule "+circumference);
	}
}