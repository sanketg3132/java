
import java.util.Scanner;
import java.lang.Math;

class MathOperation
{
	
	int multiplication(int num1,int num2)
	{
		int ans=num1*num2;
		System.out.println("multiplication of two integers is : "+ans);	
	}
	
	float multiplication(float a,float b,float c)
	{
		System.out.println("multiplication of tthree floats  is : "+a*b*c);	
	}
	double multiplication(double arr[])
	{
		double mul=1;
		for(int i=0;i<arr.length;i++)
		{
			mul*=arr[i];
		}
		
		System.out.println("multiplication of all elements of array   is : "+mul);
	}
	double multiplication(double e,int f)
	{
		System.out.println("multiplication of one double and one integer   is : "+ e*f);	
	}
}

class Q36{
	
	public static void main(String... args) {
	
		MathOperation M=new MathOperation();
		M.multiplication(10,20);
		M.multiplication(3.0f,2.0f,4.0f);
		double arr[]=new double[]{1,2,3,4,5};
		M.multiplication(arr);
		M.multiplication(12.23,36);
	}
}