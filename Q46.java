class Base {
	
	/*Base() {
		System.out.println("This is Base class Default constructor.");
	}*/
	
	/*Base(int i) {
		System.out.println("This is Base class Parameterized constructor: "+i);
	}*/
	
	void m1() {
		System.out.println("This is Base class Method");
	}
	
	void or() {
		System.out.println("This is overridden method of Base class");
	}
}

class Sub extends Base {
	
	/*Sub() {
		System.out.println("This is Sub class Default constructor.");
	}*/
	
	/*Sub(int i) {
		super(i);
		System.out.println("This is Sub class Parameterized constructor: "+i);
	}*/
	
	void m2() {
		System.out.println("This is Sub class Method");
	}
	
	void or() {
		System.out.println("This is overridden method of Sub class");
	}
	
}

class Question46 {
	
	public static void main(String args[]) {
		
		/*Sub s = new Sub();
		Sub s1 = new Sub(2);
		
		s.or();
		s.m2();
		s.m1();
		
		Base b = new Base();
		Base b1 = new Base(2);
		
		Base b = new Sub();
		Base b = new Sub(2);
		
		b.or();
		b.m2();
		b.m1();*/
		
		Base b[] = {new Sub(),
					new Base(),
					new Sub(),
					new Base()
				};
				
		for( Base b1 : b ) {
			
			if( b1 instanceof Sub ) {
				Sub a = (Sub)b1;
				a.m2();
			}
		}
		
	}
}