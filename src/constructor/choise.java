package constructor;

class mist{
	String students;
	int no_of_students;
	String purpose;
	
	mist(String students, int no_of_students, String purpose){
		//System.out.println("hello");
		this.students=students;
		this.no_of_students=no_of_students;
		this.purpose=purpose;
	}
	void hyd(){
		System.out.println("Student name is "+students+",");
		System.out.println("Only "+no_of_students);
		System.out.print("Came to hyd ");
		System.out.println( "To complete the "+purpose+" with the help of invictus");
	}
	
}
public class choise {
	
	
	choise(){
		System.out.println("from the main class");
	}
	public static void main(String[] args) {
		
		
		choise obj = new choise();
		
		mist std = new mist("uday", 1, "internship.");
		std.hyd();
		
		
	}

}

