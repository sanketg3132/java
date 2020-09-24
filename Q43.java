
import java.util.Scanner;

class OneBHK 
{
	int roomArea;
	int hallArea;
	int price;
	
	OneBHK()
	{
		roomArea=1000;
		hallArea=2000;
		price=1000000;
	}
	OneBHK(int roomArea,int hallArea,int price)
	{
		this.roomArea=roomArea;
		this.hallArea=hallArea;
		this.price=price;		
	}
	void show()
	{
		System.out.println("room area in squrefeet "+roomArea);
		System.out.println("hall area in squrefeet "+hallArea);
		System.out.println("price of one bhk flat "+price);
	}
}
class TwoBHK extends OneBHK 
{
	int room2Area;
	public static int count;

	TwoBHK()
	{
		super();
		room2Area=1500;
		count++;
	}
	TwoBHK(int roomArea1,int hallArea1,int price1,int room2Area)
	{
		super(roomArea1,hallArea1,price1);
		this.room2Area=room2Area;
		count++;	
	}
	
	void show()
	{
		super.show();
		System.out.println("room2 area in squrefeet "+room2Area);
		System.out.println("total no of flats "+count);
	}
}
class Q43{
	
	public static void main(String... args) {
	
		TwoBHK T=new TwoBHK(800,1500,1500000,1200);
		T.show();
	}
}