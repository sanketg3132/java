
import java.util.Scanner;

class person
{
	int a;
	int b;
	
	person()
	{
		this(10,20);
		System.out.println("parameter less contructer is call");
	}
	person(int a1,int b1)
	{
		this.a=a1;
		this.b=b1;
		System.out.println("parameter rise contructer is call");	
	}
	
}
class Q41{
	
	public static void main(String... args) {
	
		person p=new person();
	}
}