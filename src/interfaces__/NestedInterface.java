package interfaces__;

interface animals{
	void name();
	public interface wildanimals extends animals{
		void presentstate();
	}
}
class Lion implements animals.wildanimals{

	public void presentstate() {
		System.out.println("it is enjoying the scenery");
		
	}
	public void name() {
		System.out.println("name of the animal is LION");
		
	}

	
}
public class NestedInterface {

	public static void main(String[] args) {
		
		animals.wildanimals obj = new Lion();
		obj.presentstate();
		obj.name();


	}

}
