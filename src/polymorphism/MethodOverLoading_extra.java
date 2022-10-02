package polymorphism;

class uday{
	
	String name(String name, String stream) {
	
		return "name is "+name+"stream"+stream;	
	}
	String name(int number,float address) {
		return"roll number "+number+" address "+address;
	}
	String name(int age) {
		return"age is "+age;
	}
	String name(String name) {
		
		System.out.println("once upon a time she is ");
		
		return name+"'s girl friend";
	}
}
public class MethodOverLoading_extra {

	public static void main(String[] args) {
		
		uday mol = new uday();
		
		System.out.println(mol.name(" dinisha ", " MBA"));
		System.out.println(mol.name(76599, 279810));
		System.out.println(mol.name(22));
		System.out.println(mol.name("uday"));
	}

}
