package extra;

 class Multithreading extends Thread{
	 
	 public void run() {
		 System.out.print("Thread "+Thread.currentThread().getId()+" is Runing");
	 }
	public void second() {
		 System.out.print("2nd Thread "+Thread.currentThread().getId()+" is Runing");

	}
	
}
