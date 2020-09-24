
import java.util.Scanner;

class Circle
{
	private double radius;	
	private double area;
	
	void init()
	{
		Scanner sc=new Scanner(System.in);
		radius=sc.nextDouble();
	}
	void calculateArea()
	{
		area=3.14*(radius*radius);
	} 
	void display() 
	{
		System.out.println("radius is : "+radius);
		System.out.println("area is : "+area);
	}
}

public class Q34{
	
	public static void main(String... args) {
	
		Circle C=new Circle();
		C.init();
		C.calculateArea();
		C.display();	
	}
}