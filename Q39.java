
import java.util.Scanner;

class Tile
{
	private int SquareLength;
	
	Tile(int SquareLength)
	{
		this.SquareLength=SquareLength;
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
	int numberoftile()
	{
		int area=width*length;
		int s=super.SquareLength;
		System.out.println(s);
	}
}

class Q39{
	
	public static void main(String... args) {
	
		Scanner sc=new Scanner(System.in);
		Floor f=new Floor();
		f.numberoftile();
	}
}