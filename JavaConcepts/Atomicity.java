package JavaConcepts;

import java.util.concurrent.atomic.AtomicInteger;

class SharedResource2{
	//private int count;
	private AtomicInteger count = new AtomicInteger(0);

	public int getCount() {
		//return count;
		return count.get();
	}
	public void increment() {
		//this.count++;
		this.count.incrementAndGet();//this method makes wait to other thread until operation happen
	}
}
public class Atomicity {

	public static void main(String[] args) {
		SharedResource2 rec = new SharedResource2();
		
		new Thread(() -> {
			System.out.println("Thread 1 started");
			for(int i = 0 ; i < 50000; i++) {
				rec.increment();
			}
			System.out.println("Thread 1 ended");
		}).start();
		
		new Thread(() -> {
			System.out.println("Thread 2 started");
			for(int i = 0 ; i < 50000; i++) {
				rec.increment();
			}
			System.out.println("Thread 2 ended");
		}).start();
		
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Final count - "+rec.getCount());
		
		
		
	}

}
