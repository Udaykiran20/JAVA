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

	@Override
	void frontend() {
		// TODO Auto-generated method stub
		System.out.println("CSS " +" HTML " + " JAVA SCRIPT "+"for front end");
		
	}

	@Override
	void backend() {
		// TODO Auto-generated method stub
		System.out.println("Need to learn python programming language "+"for back end");
		
	}

	@Override
	void database() {
		// TODO Auto-generated method stub
		System.out.println("the data base working with python ");
		
	}
	
}

class Java extends fullStack{

	@Override
	void frontend() {
		// TODO Auto-generated method stub
		System.out.println("CSS " +" HTML " +" JAVA SCRIPT "+"for frontend");
		
	}

	@Override
	void backend() {
		// TODO Auto-generated method stub
		System.out.println("Need to learn java programing language for backend");
		
	}

	@Override
	void database() {
		// TODO Auto-generated method stub
		System.out.println("The data base  working with  java");
	}
	
}

public class Extra__ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
