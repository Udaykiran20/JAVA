package method;
class tollywood{
	
	void actors() {
		System.out.println("there are some actors are there in tollywood");
	}
	String hero() {
		System.out.println("one of the lead actor");
		return"prabhas";
	}
	String Hero(String name) {
		return "one of the lead actor"+name;
	}
}
public class Extra_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tollywood t = new tollywood();
			//just observe the difference in out put
		t.actors();
		System.out.println(t.hero());
		System.out.println(t.Hero(" PRABHAS"));
	}

}
