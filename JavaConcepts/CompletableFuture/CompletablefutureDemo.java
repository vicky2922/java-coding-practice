package JavaConcepts.CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletablefutureDemo {

	public static void main(String[] args) {
		// Create a CompletableFuture
        CompletableFuture<String> future = new CompletableFuture<>();

        // Define a task to be executed asynchronously
        Runnable task = () -> {
            try {
            	System.out.println("Task started");
                // Simulate some computation
                Thread.sleep(2000);
                // Complete the CompletableFuture with a result
                future.complete("Task completed successfully!");
            } catch (InterruptedException e) {
                // Complete the CompletableFuture exceptionally if an error occurs
                future.completeExceptionally(e);
            }
        };

        // Start the task asynchronously
        Thread thread = new Thread(task);
        thread.start();

        // Perform some other operations while the task is running

        // Retrieve the result from the CompletableFuture when it's available
        future.thenAccept(result -> System.out.println("Result: " + result));

        // Wait for the task to complete
        try {
            future.join();
        } catch (Exception e) {
            System.out.println("Task encountered an exception: " + e.getMessage());
        }
        
        
        
        
		/*
		ExecutorService executor = Executors.newFixedThreadPool(4);
		
		CompletableFuture<String> completableFuture = 
				CompletableFuture.supplyAsync(()-> "I am original>>");
		
		completableFuture.thenApplyAsync(x -> "I am second>>"+x)
				.thenApplyAsync(x -> "I am third>>"+x)
				.thenAcceptAsync(x -> System.out.println(x));
		
		CompletableFuture<Integer> future = 
				CompletableFuture.supplyAsync(()-> 5, executor);
		future.thenApplyAsync(i -> i+15+" >>First thread pool>>"+Thread.currentThread().getName(), executor)
			.thenAcceptAsync(x -> System.out.println("The sum is "+x+">>second thread pool>>"+Thread.currentThread().getName()),executor);
		
		System.out.println("Main >>" +Thread.currentThread().getName());
		*/
		
		
	}

}

