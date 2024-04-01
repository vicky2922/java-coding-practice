package JavaConcepts.CompletableFuture;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableVsRunnable {

	static int sumR = 0;
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		int number = 1000;
		
		//create callable to calculate sum
		Callable<Integer> sumTask = () -> {
				int sum=0;
				for(int i=1;i<number;i++) {
					sum+=i;
				}
				return sum;
		};
		
		//create thread pool
		ExecutorService executor = Executors.newSingleThreadExecutor();
		
		//submit task for execution
		Future<Integer> future = executor.submit(sumTask);
		
		//Do other work concurrently while  waiting for result
		
		int result = future.get();
		System.out.println(result);
		
		//shutdown executor
		executor.shutdown();
		
		ExecutorService executorRunnable = Executors.newSingleThreadExecutor();
		executorRunnable.execute(() -> {
			for(int i=1;i<number;i++) {
				sumR+=i;
			}
			System.out.println(sumR);
		});
		//can get value
		//sync issue, no return, no checked exception
		
	}

}
