package JavaConcepts.CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompletableFuture.supplyAsync(() -> {
	        // Perform some computation asynchronously
	        return "Result of the computation";
	    })
	    .thenApply(result -> {
	        // Process the result asynchronously
	        return "Processed " + result;
	    })
	    .thenAccept(processedResult -> {
	        // Consume the processed result
	    	//int x = 10/0;
	        System.out.println("Processed result: " + processedResult);
	    })
	    .exceptionally(ex -> {
	        // Handle exceptions
	        System.err.println("Exception occurred: " + ex);
	        return null;
	    });

	}

}
/*
We start with a CompletableFuture created using supplyAsync.
We chain it with thenApply to process the result.
Then, we chain it with thenAccept to consume the processed result.
Finally, we handle any exceptions using exceptionally.
*/