
public class WaitandNotifyDemo {
	static public int balance = 0;
	public void withdraw(int amount) {
		synchronized (this) {
			if (balance <= 0) {
				try {
					System.out.println("Waiting for balance updation");
					wait();
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		balance = balance - amount;
		System.out.println("Withdrawal successful and the current balance: "+ balance);
	}
	
	public void deposit (int amount) {
		System.out.println("We are depositing the amount");
		balance = balance + amount;
		synchronized (this) {
			notify();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WaitandNotifyDemo wn = new WaitandNotifyDemo();
		
		Thread t1 = new Thread (new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				wn.withdraw(100);
			}
			
		}); 
		
		t1.setName("T1");
		t1.start();
		Thread t2 = new Thread (new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				wn.deposit(2000);
			}
			
		}); 
		t2.setName("T2");
		t2.start();
	}

}
