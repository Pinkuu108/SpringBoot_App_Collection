package Daily_Practice_Coding;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class bank {
	private int bal=90;
	private Lock lock=new ReentrantLock();
	public void getwithdraw(int amount)
	{
		System.out.println(Thread.currentThread().getName()+"Is trying to Veryfy....");
		try{
			
			if(lock.tryLock(1000, TimeUnit.MILLISECONDS))
			{
				if(bal>=amount)
				{
					
					try {
						System.out.println(Thread.currentThread().getName()+"Processing Paymeant....");
						Thread.sleep(3000);
						bal-=amount;
						System.out.println(Thread.currentThread().getName()+"Withdraw is sucessfull....,Balance:"+bal);
						
					} catch (Exception e) {
						
					}finally {
						lock.unlock();
					}
					
				}else {
					System.out.println(Thread.currentThread().getName()+"Insuficeant Balance...");
				}
			}else {
				System.out.println(Thread.currentThread().getName()+"Visit Again....");
			}
			
		}catch (Exception e) {
		
		}
	}

}

public class Without_SynchronosedKeyWord {
	public static void main(String[] args) {
		bank b=new bank();
		Runnable r=new Runnable() {
			
			@Override
			public void run() {
			b.getwithdraw(2);
				
			}
		};
		Thread t1=new Thread(r,"Thread--  1:");
		Thread t2=new Thread(r,"Thread--  2:");
		t1.start();
		t2.start();
		
	}

}
