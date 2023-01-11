package extra;

public class MultiThreading2 {

	public static void main(String[] args) {
		int i=5;
		
		for(int j=0;j<i;j++) {
			Multithreading obj = new Multithreading();
			obj.second();
			obj.start();
			
		}
		System.out.println(Thread.activeCount()+" Threads are active");
		System.out.println(Thread.currentThread().getName()+" is name of the thread");
		

	}

}
