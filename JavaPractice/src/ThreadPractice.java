
public class ThreadPractice {
	public static int counter = 0;
	public static void main(String[] args) throws InterruptedException {
		ThreadPractice t1 = new ThreadPractice();
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i=1; i<=3; i++) {
					//ThreadPractice.counter++;
					t1.brackets();
				}
				System.out.println("Thread 1 completed looping.");
			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i=1; i<=3; i++) {
					//ThreadPractice.counter++;
					t1.brackets();
				}
				System.out.println("Thread 2 completed looping.");
			}
		});
		
		thread1.start();
		thread2.start();
		//Thread.sleep(3000);
		//System.out.println("Value for counter: "+counter);
	}
	 public void brackets()
	 {
		 synchronized(this)
		 {
		int j=10;
		 for (int i=1;i<=j;i++) {
			 if (i <= 5)
				 System.out.print("[");
			 else
				 System.out.print("]");
		 }
		 System.out.println();
		}
		{
			for (int i=1;i<=4;i++) 
			System.out.println("Contents of non-synchronized block.");
		}
	 }

}
