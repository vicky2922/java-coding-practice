package JavaConcepts.CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class ExceptionallyDemo {

	public static void main(String[] args) {
		System.out.println("TRACE_1"+" "+Thread.currentThread().getName());
		// CompletableFuture that intentionally throws an exception
		CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
			// Simulate some computation which results in an exception
			System.out.println("Performing computation..."+" "+Thread.currentThread().getName());
			throw new RuntimeException("Exception occurred during computation");
		});
		
		
		System.out.println("TRACE_2"+" "+Thread.currentThread().getName());
		// Handle the exception using exceptionally
		CompletableFuture<Integer> handledFuture = future.exceptionally(ex -> {
			System.err.println("Exception occurred: " + ex.getMessage()+" "+Thread.currentThread().getName());
			return -1; // Provide a default value to be returned in case of exception
		});
		
		
		System.out.println("TRACE_3 "+Thread.currentThread().getName());
		// Join and print the result of handledFuture
		System.out.println("Result: " + handledFuture.join()+" "+Thread.currentThread().getName());
	}
}
