

import java.util.Scanner;
class Q19{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		int sum=0;
		int k=12;
		
		for(int i=0; i<n; i++){
			if(i==0)
				System.out.print(k);
			else
				System.out.print("+"+k);
			sum=sum+k;
			k+=10;
			
		}
		System.out.print(" = "+sum);
	}
}