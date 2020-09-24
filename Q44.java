
import java.util.Scanner;

class Faculty 
{
	int facultyId;
	double salary;
	
	Faculty(){}
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the facultyId ");
		facultyId=sc.nextInt();
	}
	void show()
	{
		System.out.println("facultyId :"+facultyId);
		System.out.println("salary :"+salary);
	}
}
class FullTimeFaculty extends Faculty 
{
	int basicSalary;
	int allowance;
	
	FullTimeFaculty(){}

	void input()
	{
		super.input();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the basicSalary ");
		basicSalary=sc.nextInt();
		System.out.println("Enter the allowance ");
		allowance=sc.nextInt();
	}
	void calculatesalary()
	{
		salary=basicSalary+allowance;
	}
	
} 
class PartTimeFaculty extends Faculty 
{
	double workingHours;
	int ratePerHour;
	
	PartTimeFaculty(){}

	void input()
	{
		super.input();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the workingHours ");
		workingHours=sc.nextDouble();
		System.out.println("Enter the ratePerHour ");
		ratePerHour=sc.nextInt();
	}
	void calculatesalary()
	{
		salary=workingHours * ratePerHour ;
	}
	
} 
class Q44{
	
	public static void main(String... args) {
	
		FullTimeFaculty F=new FullTimeFaculty();
		F.input();
		F.calculatesalary();
		F.show();
		PartTimeFaculty P=new PartTimeFaculty();
		P.input();
		P.calculatesalary();
		P.show();
	}
}