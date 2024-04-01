package JavaConcepts;

class SharedResource{
	private boolean flag = false;
//	private volatile boolean flag = false;

	public synchronized boolean isFlag() {
		return flag;
	}
	public synchronized void setFlag(boolean flag) {
		this.flag = flag;
	}
}

public class VolatileAndSynchronized {

	public static void main(String[] args) {
		SharedResource rec = new SharedResource();
		
		new Thread(() -> {
			System.out.println("Thread 1 started");
			try {
				System.out.println("Thread 1 logic started");
				Thread.sleep(1000);
				System.out.println("Thread 1 logic ended");
				rec.setFlag(true);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}).start();
		
		//while adding volatile keyword thread 2 read it from main memory where it got update also
		
		new Thread(() -> {
			System.out.println("Thread 2 started");
			while(!rec.isFlag()) {
				
			}
			System.out.println("Thread 2 logic ended");
		}).start();
	}

}
