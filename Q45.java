class Student {
	
	private int rollNo;
	private float percentage;
	
	Student() {
		
		rollNo = 0;
		percentage = 0;
		
	}
	
	Student(int rollNo, float percentage) {
		
		this.rollNo = rollNo;
		this.percentage = percentage;
		
	}
	
	void show() {
		
		System.out.print(rollNo+" :- "+percentage);
		
	}
	
}

class CollegeStudent extends Student {
	
	private int semester;
	
	CollegeStudent() {
		
		semester = 0;
		
	}
	
	CollegeStudent(int rollNo, float percentage, int semester) {
		
		super(rollNo, percentage);
		this.semester = semester;
		
	}
	
	void show() {
		
		super.show();
		System.out.println(","+semester);
		
	}
	
}

class SchoolStudent extends Student {
	
	private int className;
	
	SchoolStudent() {
		
		className = 0;
		
	}
	
	SchoolStudent(int rollNo, float percentage, int className) {
		
		super(rollNo, percentage);
		this.className = className;
		
	}
	
	void show() {
		
		super.show();
		System.out.println(","+className);
		
	}
	
}

class Question45 {
	
	public static void main(String args[]) {
		
		Student s[] = {new CollegeStudent(1,50,2), 
				new CollegeStudent(2,60,3), 
				new SchoolStudent(22,90,10),
				new SchoolStudent(23,60,11),
				new SchoolStudent(24,55,12)
			};
		
		/*s[] = {new CollegeStudent(1,50,2), 
				new CollegeStudent(2,60,3), 
				new SchoolStudent(22,90,10),
				new SchoolStudent(23,60,11),
				new SchoolStudent(24,55,12)
			};*/
			
		for(Student sa : s) {
			
			sa.show();
			
		}
	}
}