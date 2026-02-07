package Interview_Related_Code;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Account1 {
	private int balance = 100;
	private final Lock lock = new ReentrantLock();

	public void withdraw(int amount) {
		try {
			if (lock.tryLock(100, TimeUnit.MILLISECONDS)) {
				if (balance >= amount) {

					try {
						System.out.println(Thread.currentThread().getName() + " Wihtdraw is Pending...");
						Thread.sleep(3000);
						balance = balance - amount;
						System.out.println(Thread.currentThread().getName()
								+ " withdrawl is Sucessfully: Current Balance is :" + balance);

					} catch (Exception e) {
						Thread.currentThread().interrupt();
						System.out.println("All Exception Are Handled..");
					} finally {
						lock.unlock();
					}

				} else {
					System.out.println(Thread.currentThread().getName() + ":Insufficeant Balance..");
				}

			} else {
				System.out.println(Thread.currentThread().getName() + ":Someone is Trying, Try Again Letter..");
			}

		} catch (Exception e) {
			Thread.currentThread().interrupt();
			System.out.println("ALL EXCEPTION ARE HANDDLED");
		}

	}

}

public class Class_Level_Lock2 {
	public static void main(String[] args) {

		Account1 sbi = new Account1();
		Runnable rr = new Runnable() {

			@Override
			public void run() {
				sbi.withdraw(20);

			}
		};
		Thread t1 = new Thread(rr, "Thread 1");
		Thread t2 = new Thread(rr, "Thread 2");
		t1.start();
		t2.start();
	}

}
