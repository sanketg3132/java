
import java.util.Scanner;

public class Q7{

	public static void main(String... a){

		Scanner sc=new Scanner(System.in);
		
		double sum=0;

		for(int i=1;i<=5;i++){
			System.out.print("Enter the mark of subject "+i+" " );
			int marks=sc.nextInt();
			
			sum+=marks;		
		}

		double percentage=((sum/500)*100);
		System.out.print("percentage marks "+percentage);
	}
}