package abstract_;
abstract class fullStack{
	
	fullStack(){
		
		System.out.println("from the scratch to advanced");
		
	}

abstract void frontend();
abstract void backend();
abstract void database();
}

class python extends fullStack{
	
	void python() {
		System.out.println("for python fullStack developer");
	}
	void frontend() {
		
		System.out.println("CSS " +" HTML " + " JAVA SCRIPT "+"for front end");
		
	}
	void backend() {
		System.out.println("Need to learn python programming language "+"for back end");
		
	}

	@Override
	void database() {
		System.out.println("the data base working with python ");
		
	}
	
}

class Java extends fullStack{

	
	void frontend() {
		System.out.println("CSS " +" HTML " +" JAVA SCRIPT "+"for frontend");
		
	}

	@Override
	void backend() {
		System.out.println("Need to learn java programing language for backend");
		
	}
	void database() {
			System.out.println("The data base  working with  java");
	}
	
}

public class Extra__ {

	public static void main(String[] args) {
			fullStack dev;
		
		dev= new python();
		//dev.fullStack();
		dev.frontend();
		dev.backend();
		dev.database();
		System.out.println();
		dev=new Java();
		dev.frontend();
		dev.backend();
		dev.database();

	}

}
