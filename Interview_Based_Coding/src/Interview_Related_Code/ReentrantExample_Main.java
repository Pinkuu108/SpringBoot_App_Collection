package Interview_Related_Code;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ReentrantExample {
	private final Lock lock = new ReentrantLock();

	public void innermethod() {
		lock.lock();
		try {
			System.out.println("ReentrantExample.innermethod()");
			outermethod();

		} finally {
			lock.unlock();
		}
	}

	public void outermethod() {
		lock.lock();
		try {
			System.out.println("ReentrantExample.outermethod()");

		} finally {
			lock.unlock();
		}
	}
}

public class ReentrantExample_Main {
	public static void main(String[] args) {
		ReentrantExample ren = new ReentrantExample();
		ren.innermethod();
	}

}
