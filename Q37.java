
import java.util.Scanner;

class employees
{
	private int empNo;
	private double salary;
	private double totalSalary;
	
	employees(double salary)
	{
		this.salary=salary;
		this.empNo++;
		totalSalary=this.salary+salary;
	}
	void show()
	{
		System.out.println("total employees are : "+empNo);
		System.out.println("total Salary is : "+totalSalary);
	}
}

class Q38{
	
	public static void main(String... args) {
	
		employees e1=new employees(10000);
		employees e2=new employees(20000);
		employees e3=new employees(30000);
	}
}