
import java.util.Scanner;

class Product
{
	private int pid;
	private double price;
	private int quantity;
	private static int maxprice=0;
	private static int maxpid=0;
	
	employees(int pid,double price,int quantity)
	{
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
		if(maxprice<price)
		{
			maxprice=price;
			maxpid=pid;
		}
	}
	void show()
	{
		System.out.println("pid of product with highest price "+maxpid+" "+maxprice);
	}
}

class Q39{
	
	public static void main(String... args) {
	
		Scanner sc=new Scanner(System.in);
		Product p[]=new Product[4];
		for(int i=0;i<4;i++)
		{
			System.out.println("Enter the pid of product ");
			int pid1=sc.nextInt();
			System.out.println("Enter the price of product ");
			int price1=sc.nextInt();
			System.out.println("Enter the price of product ");
			int quantity1=sc.nextInt();
			Product p1=new Product(pid1,price1,quantity1);
			p[i]=p1;
		}
		Product.show();
	}
}