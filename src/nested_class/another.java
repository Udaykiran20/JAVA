package nested_class;

class one{
	 void main() {
		 System.out.println("sjdhfjshjf");
	 }
//	void mail() {
//		obj1.whatsup();
//		System.out.println("contact me through mail");
//		
//		class msg {
//			void main() {
//				System.out.println("fgjhghfkf");
//			}
//		}
//		msg m = new msg();
//		m.main();
//				}
//	class two{
//		void whatsup() {
//			System.out.println("enter your whatsup number");
//						}
//	}
//	two obj1=new two();
//	static class three{
//		void msg() {
//			System.out.println("get in touch with txt msg");
//		}
//	}
}

public class another  {

	public static void main(String[] args) {
		
		one obj = new one();
		obj.main();
		one obj2=new one(){
			
			void main() {
				
				System.out.println("jyadgyajshdj");
			}
		};
		obj2.main();
		
//		obj2.mail();
//		one.three obj = new one.three();
//		obj.msg();


	}

}
