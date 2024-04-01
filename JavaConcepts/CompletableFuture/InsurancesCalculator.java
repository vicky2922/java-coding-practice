package JavaConcepts.CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class InsurancesCalculator {
	
	private static int getCoverage() {
		try {
			System.out.println("Coverage calculation started...");
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return 30000;
	}

	private static int getCommision() {
		try {
			System.out.println("Commissoin calculation started...");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return 20000;
	}

	private static int getBonus() {
		System.out.println("Bonus calculation started...");
		return 10000;
	}

	public static void main(String[] args) {
		System.out.println("Premium calculation started...");
		CompletableFuture<Integer> f1 = CompletableFuture.supplyAsync(() -> getBonus());
		CompletableFuture<Integer> f2 = CompletableFuture.supplyAsync(() -> getCommision());
		CompletableFuture<Integer> f3 = CompletableFuture.supplyAsync(() -> getCoverage());
		
		//wait for all future task to execute
		CompletableFuture<Void> cf = CompletableFuture.allOf(f1,f2,f3);
		try {
			cf.get();
			System.out.println("All CompletableFutures have completed their execution.");
            System.out.println("1 -> Bonus : " + f1.get());
            System.out.println("2 -> Commission : " + f2.get());
            System.out.println("3 -> Coverage : " + f3.get());
            int sum = f1.get()+f2.get()+f3.get();
            System.out.println("Final Total : " + sum );
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
		
		/*	int r1 =f1.get();
			int r2 = f2.get();
			int r3 = f3.get();
			System.out.println(r1+r2+r3);
		*/
	//	CompletableFuture<Integer> f =f1.thenCombine(f2, (x1,x2)->x1+x2).thenCombine(f3, (x1,x2)->x1+x2);
	//	System.out.println(f.join());
		
	}

}

/*
GET()
It blocks the current thread until the result is available or the computation is completed.

If the result is not available yet, 
the calling thread will be blocked until the computation completes or until the specified timeout (if provided) expires.

If an exception occurs during the computation, 
it will be wrapped in an ExecutionException, which is then thrown by the get() method. 
It also throws InterruptedException if the thread is interrupted while waiting for the result.

Use Case: Use get() when you need to retrieve the result and are prepared to handle potential exceptions 
or wait indefinitely for the result.


JOIN()
It behaves similarly to get(), but it doesn't throw checked exceptions (InterruptedException and ExecutionException). 
Instead, it throws CompletionException, which is an unchecked exception.

Since it doesn't throw checked exceptions, 
it's more convenient to use in situations where you are sure that the computation will complete successfully without exceptions.

If an exception occurs during the computation, it will be wrapped in a CompletionException, 
which is then thrown by the join() method.

Use Case: Use join() when you need to retrieve the result and are confident that no exceptions will occur during the computation, 
or you prefer handling unchecked exceptions.
*/