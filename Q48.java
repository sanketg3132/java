import java.util.Scanner;

abstract class Processor {
	
	private int data;
	
	Processor() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the data: \n");
		data = sc.nextInt();
		
	}
	
	int getData() {
		return data;
	}
	
	void showData() {
		
		System.out.print("Value: "+data+"\n");
		
	}
	
	abstract void process();
	
}

class Factorial extends Processor {
	
	void process() {
		
		int fact = 1;
		
		for(int i = 1; i <= getData(); i++) {
			
			fact *= i;
			
		}
		
		System.out.print("Factorial of: "+getData()+" is: "+fact);
		
	}
	
}

class Circle extends Processor {
	
	void process() {
		
		System.out.print("Area of circle is: "+(getData()*getData())*3.14);
		
	}
	
}

class Question48 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter fact for Factorial and area for area of circle: ");
		
		String choice = sc.next();
		
		if( choice.equals("fact")) {
			
			Processor p = new Factorial();
			p.process();
			
		}else {
			
			Processor p = new Circle();
			p.process();
			
		}
		
		//Processor p = new Factorial();
		//	p.process();
			
		//Processor p = new Circle();
		//	p.process();
		
	}
	
}