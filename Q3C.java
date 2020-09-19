class Q3C{

	public static void main(String... a){

		int x=10;
		int y=15;
		int z=(x++ - --y + x++);
		System.out.println("value of x is "+x);
		System.out.println("value of y is "+y);
		System.out.println("value of z is "+z);
	}
}