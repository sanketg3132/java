import java.util.Scanner;

interface Taxable {
	
	float salesTax = 7f;
	float incomeTax = 10.5f;
	
	void calcTax();
	
}

class Employee implements Taxable {
	
	private int empId;
	private String name;
	private float salary;
	
	Employee(int empId, String name, float salary) {
		
		this.empId = empId;
		this.name = name;
		this.salary = salary;

	}
	
	public void calcTax() {
		
		System.out.print("Income tax is: "+((incomeTax*salary)/100)*12+"\n");
		
	}
	
}

class Product implements Taxable {
	
	private int pId;
	private int price;
	private int quantity;
	
	Product(int pId, int price, int quantity) {
		
		this.pId = pId;
		this.price = price;
		this.quantity = quantity;

	}
	
	public void calcTax() {
		
		System.out.print("Sales tax is: "+(((price*quantity)*salesTax)/100)*12);
		
	}
	
}

class Question49 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter empid, name, salary: ");
		int empId = sc.nextInt();
		String name = sc.next();
		float salary = sc.nextFloat();
		
		Taxable t1 = new Employee(empId, name, salary);
		t1.calcTax();
		
		System.out.println("Enter pid, price, quantity: ");
		int pId = sc.nextInt();
		int price = sc.nextInt();
		int quantity = sc.nextInt();
		
		Taxable t2 = new Product(pId, price, quantity);
		t2.calcTax();
		
	}
	
}