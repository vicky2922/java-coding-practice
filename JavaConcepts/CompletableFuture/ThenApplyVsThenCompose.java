package JavaConcepts.CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class ThenApplyVsThenCompose {

	public static void main(String[] args) {
		CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 2);

		// thenApply -> returns a value
		CompletableFuture<String> appliedFuture = future.thenApply(result -> "Result: " + result);

		// thenCompose -> returns a CompletableFuture
		CompletableFuture<String> composedFuture = future.thenCompose(result -> CompletableFuture.supplyAsync(() -> "Result: " + result));

		// Output the results
		System.out.println(appliedFuture.join());  // Output: Result: 2
		System.out.println(composedFuture.join()); // Output: Result: 2

	}

}
/*
thenApply:

Syntax: thenApply(Function<? super T,? extends U> fn)
Purpose: thenApply is used when you want to perform a synchronous mapping operation on the result of a CompletableFuture.

Behavior: It takes a Function as an argument, which is applied to the result of the CompletableFuture when it completes. 
			The function returns a value that will be used to complete the returned CompletableFuture.
			
Use Case: Use thenApply when you want to transform the result of a CompletableFuture synchronously.
thenCompose:

Syntax: thenCompose(Function<? super T,? extends CompletionStage<U>> fn)
Purpose: thenCompose is used when you want to perform an asynchronous mapping operation on the result of a CompletableFuture 
and return another CompletableFuture.

Behavior: It takes a Function as an argument, which is applied to the result of the CompletableFuture when it completes. 
			This function returns another CompletableFuture, and thenCompose 
			returns a CompletableFuture that will be completed with the result of this nested CompletableFuture.
			
Use Case: Use thenCompose when you want to chain CompletableFuture instances asynchronously, 
particularly when the result of one CompletableFuture determines the computation of the next one.
*/