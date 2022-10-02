package inheritancE;

class telangana{
	void state() {
		System.out.println("telangan is a new state");
	}
	
}

class khammam extends telangana{
	
	String district(String district) {
		
		return district+" is best district ";
	}
}
class kothagudem extends telangana{
	
	String coal(String palvancha) {
	return palvancha+" is hub for coal power and supply";
	}
}
class komarambeem extends telangana{
	void forest() {
		System.out.println("in komarambeem district there is high forest area is there");
	}
}
public class Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		khammam k = new khammam();
		k.state();
		System.out.println(k.district("khammam"));
		kothagudem ko = new kothagudem();
		System.out.println(ko.coal("palvancha"));
		komarambeem kom = new komarambeem();
		kom.forest();
	}

}
