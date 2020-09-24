
import java.util.Scanner;

class Circle
{
	private double radius;	
	private double area
	
	void init()
	{
		Scanner sc=new Scanner(System.in);
		radius=nextDouble();
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

class Q34{
	
	public static void main(String... args) {
	
		Student s=new Student();
		s.init();
		s.calculateArea();
		s.display();	
	}
}