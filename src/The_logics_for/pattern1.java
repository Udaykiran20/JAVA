package The_logics_for;

public class pattern1 {

	public static void main(String[] args) {
		
//		for(int i=1; i<=5;i++) {
//			for(int j=5;j>=i;j--) {
//				System.out.print(j);
//			
//		}System.out.println();
//
//	}
//		for(int i=5; i>0;i--) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		int a=0, b=1,tem=0;
		for(int i=1;i<5;i++) {
			for(int j=1;j<=i;j++) {
				if(a<=34) {
					tem=a+b;
					System.out.print(" "+a);
					a=b;
					b=tem;
				}
			}
			System.out.println();
		}
		
		for(int i=1;i<5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" "+j);
			}
			for(int k=4;k>i;k--) {
				System.out.print(" "+i);
			}
			System.out.println();
		}
}
}
