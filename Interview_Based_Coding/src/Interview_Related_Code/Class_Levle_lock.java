package Interview_Related_Code;

class Account {
	private int balance = 100;

	public synchronized void withdraw(int amount) {
		if (balance >= amount) {
			System.out.println(Thread.currentThread().getName() + "Withdraw is Pending Please Wait...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				System.out.println("All Exception Are Handled...");

			}
			balance = balance - amount;
			System.out.println(Thread.currentThread().getName()+"Current Balance is " + balance);
			System.out.println(Thread.currentThread().getName()+"Withdraw is Sucessfull");

		} else {
			System.out.println(Thread.currentThread().getName() + "Insufficeant Balance....");
		}
	}
}

public class Class_Levle_lock {

	public static void main(String[] args) {
		Account uco = new Account();
		Runnable r = new Runnable() {

			@Override
			public void run() {
				uco.withdraw(40);

			}
		};
		Thread t1 = new Thread(r, "t1 Thread");
		Thread t2 = new Thread(r, "t2 Thread");
		t1.start();
		t2.start();

	}
}
