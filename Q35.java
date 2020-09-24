
import java.util.Scanner;
import java.lang.Math;

class MathOperation
{
	
	int multiplication(int num1,int num2)
	{
		return num1*num2;	
	}
	
	float multiplication(float a,float b,float c)
	{
		return a*b*c;	
	}
	double multiplication(double arr[])
	{
		double mul=1;
		for(int i=0;i<arr.lenght;i++)
		{
			mul*=arr[i];
		}
		
		return mul;	
	}
	double multiplication(double e,int f)
	{
		return e*f;	
	}
	
	void show()
	{
		System.out.println("multiplication  is : "+multiplication());
	}
}

class Q35{
	
	public static void main(String... args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two number ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		MathOperation M=new MathOperation(a,b);
		M.add();
		M.subtract();
		M.multiply();
		M.power();
		M.show();
	}
}