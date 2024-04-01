package JavaConcepts;

public class StringBuilderVsBuffer {

	public static void main(String[] args) {
		StringBuilder sBuilder = new StringBuilder();
		StringBuffer sBuffer = new StringBuffer();
		
		Thread t1 = new Thread(()->{
			for(int i=0;i<1000;i++) {
				sBuilder.append("A");
			}
		});
		
		Thread t2 = new Thread(()->{
			for(int i=0;i<1000;i++) {
				sBuilder.append("B");
			}
		});
		
		t1.start();
		t2.start();
		
		//wait for thread to end
		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//#######
		Thread t3 = new Thread(()->{
			for(int i=0;i<1000;i++) {
				sBuffer.append("A");
			}
		});
		
		Thread t4 = new Thread(()->{
			for(int i=0;i<1000;i++) {
				sBuffer.append("B");
			}
		});
		
		t3.start();
		t4.start();
		
		//wait for thread to end
		try {
			t3.join();
			t4.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("String builder length - "+sBuilder.toString().length());
		System.out.println("String buffer length - "+sBuffer.toString().length());
		
		//String builder is not thread safe
		//String buffer is thread safe and slower
	}

}
