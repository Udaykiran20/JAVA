package constructor;
class parent{
	//int age = 54;
	parent(int age){
		System.out.println("parent age is "+age);
	}
}
class child extends parent{
	int age=22;
	//void details()

	
	child(int age)
	{
		super(54);
		 //super(); // not required must. it is optional
		//System.out.println("parent age "+super.age);
		System.out.println("child age "+this.age);//this is optional
	}
}
public class constructorDemo2 {

	public static void main(String[] args) {
		
		child x= new child(22);
		//x.details();
		

	}

}
