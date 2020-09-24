
import java.util.Scanner;

class Tile
{
	int SquareLength;
	
	void set()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the SquareLength");
		SquareLength=sc.nextInt();
	}	
}
class Floor extends Tile
{
	private int length;
	private int width;
	
	
	Floor(int length,int width)
	{
		this.length=length;
		this.width=width;
	}
	void numberoftile()
	{
		int area=width*length;
		int s=(area/super.SquareLength);
		System.out.println("whole number of tiles needed to cover the floor completely : "+s);
	}
}

class Q42{
	
	public static void main(String... args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Length rentangle");
		int l=sc.nextInt();
		System.out.println("Enter the width rentangle");
		int w=sc.nextInt();
		Floor f=new Floor(l,w);
		f.set();
		f.numberoftile();
	}
}