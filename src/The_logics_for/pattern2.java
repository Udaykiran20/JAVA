package The_logics_for;

public class pattern2 {

	public static void main(String[] args) {
		for(int u=5;u>0;u--) {
			for(int j=5-u;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=u;k++) {
				if(u%2!=0) {
					System.out.print(" *");
				}
				System.out.print(" *");
			}
			System.out.println();
		}
		for(int i=5;i>0;i--) {
			for(int j=5-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				if(i%2!=0) {
					System.out.print(" *");
				}
				System.out.print(" *" );
			}
			System.out.println();
		}

	

}}
