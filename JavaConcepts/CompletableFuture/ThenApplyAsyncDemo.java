package JavaConcepts.CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;


public class ThenApplyAsyncDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		//ExecutorService exe = Executors.newFixedThreadPool(3);
		
		CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            // Simulate some long-running computation
            try {
            	System.out.println("future execution started..."+Thread.currentThread().getName());
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("future execution ended..."+Thread.currentThread().getName());
            return 10; // Return a value once computation is done
        });

        CompletableFuture<String> asyncResult = future.thenApplyAsync(value -> {
        	System.out.println("asyncResult execution started..."+Thread.currentThread().getName());
        	
            // This function will execute asynchronously
            // but still receives the value from the previous CompletableFuture
        	System.out.println("asyncResult execution ended..."+Thread.currentThread().getName());
            return "Result: " + value;
        });

        // Block and wait for the result
        String result = asyncResult.get();
        System.out.println(result); // Output: Result: 10
        
	}

}

/*
In thenApplyAsync, the function is indeed executed asynchronously, 
meaning it might run on a different thread from the one where the CompletableFuture is completed. 
However, the value passed to the function is still the result of the previous CompletableFuture.

The thenApplyAsync method internally ensures that it captures the result of 
the previous CompletableFuture and applies the provided function asynchronously to that result. 
This process involves scheduling the function to run in a separate thread, 
but it doesn't change the fact that the value passed to the function is the result of the previous stage of the computation.

To clarify:

The initial CompletableFuture is executed asynchronously, possibly in a separate thread, and produces a result.
When the initial CompletableFuture completes, the result is then passed to the function provided to thenApplyAsync.
The function provided to thenApplyAsync is executed asynchronously, 
potentially on a different thread, using the result from the previous stage.
So, even though the function is executed asynchronously, it still operates on the value produced 
by the previous stage in the chain of computations. This allows for concurrent execution while maintaining 
the correct data dependencies between stages.
*/