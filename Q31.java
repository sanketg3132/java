
import java.util.Scanner;

class Student
{
	private int rollno;
	private String name;
	
	void setData(int r, String n)
	{
		rollno = r;
		name = n;
	}
	
	void showData()
	{
		System.out.println("rollno is : "+rollno);
		System.out.println("name is : "+name);
	}
}

class Q31{
	
	public static void main(String... args) {
	
		Student s=new Student();
		s.setData(1,"sanket");
		s.showData();
		Student s1=new Student();
		s1.setData(2,"prerna");
		s1.showData();
			
	}
}