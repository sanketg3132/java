
import java.util.Scanner;

class Student
{
	private int rollno;
	private String name;
	private static int NoOfStudent;
	
	void setData(int r, String n)
	{
		rollno = r;
		name = n;
		NoOfStudent++;
	}
	
	void showData()
	{
		System.out.println("rollno is : "+rollno);
		System.out.println("name is : "+name);
		System.out.println("No Of Student is : "+NoOfStudent);
	}
}

class Q32{
	
	public static void main(String... args) {
	
		Student s=new Student();
		s.setData(1,"sanket");
		s.showData();
		Student s1=new Student();
		s1.setData(2,"prerna");
		s1.showData();
			
	}
}