class Q3D{

	public static void main(String... a){

		boolean x=true;
		boolean y=true;
		boolean z=(x && y || !(x || y));
		System.out.println("value of x is "+x);
		System.out.println("value of y is "+y);
		System.out.println("value of z is "+z);
	}
}