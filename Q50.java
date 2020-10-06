import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

class Employee{
	
	private int empId;
	private String name;
	private int salary;
	
	Employee(int empId, String name, int salary){
		
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		
	}
	
	public String toString(){
		
		return empId+" "+name+" "+salary;
		
	}
	
	public boolean equals(Object obj){
		
		Employee e = (Employee)obj;
		
		return this.empId == e.empId;
		
	}
	
}

class Question50{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int empId;
		String name;
		int salary;
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		entry:
		while(true){
			
			System.out.print("Enter the empid: ");
			empId = sc.nextInt();
			
			System.out.print("Enter employee name: ");
			name = sc.next();
			
			System.out.print("Enter employee salary: ");
			salary = sc.nextInt();
			
			Employee e = new Employee(empId,name,salary);
			
			Iterator itr = al.iterator();
			while(itr.hasNext()){
				//System.out.println("xyz");
				Employee temp = (Employee)itr.next();
				
				if(temp.equals(e)){
					
					System.out.println("Entered id is duplicate");
					System.out.println("re enter information");
					
					continue entry;
					
				}
			}
			
			al.add(e);
			
			String todo = sc.next();
			if(todo.equals("exit"))
				break;
			
		}
		
		Iterator itr = al.iterator();
		while(itr.hasNext()){
			
			Employee temp = (Employee)itr.next();
			
			System.out.println(temp);
			
		}
		
	}
}