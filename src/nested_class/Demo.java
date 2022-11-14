package nested_class;

class University{
	static class department{
		void prepare() {
			System.out.println("on paper takes today time");
		}
		static void announcement(){
			System.out.println("from the nested class static method");
		}
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		University.department.announcement();
		University.department mech = new University.department();
		mech.prepare();
	}

}
