package JavaConcepts.CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class CompletablefutureCompostion {

	public static void main(String[] args) {

		// First CompletableFuture: Fetches user ID
		CompletableFuture<Integer> userIdFuture = CompletableFuture.supplyAsync(() -> {
			System.out.println("Fetching user ID...");
			// Simulate fetching user ID from a database
			return 123;
		});

		// Second CompletableFuture: Fetches user details using the user ID obtained from the first CompletableFuture
		CompletableFuture<String> userDetailsFuture = userIdFuture.thenCompose(userId -> {
			System.out.println("Fetching user details for user ID: " + userId);
			// Simulate fetching user details from a service using the user ID
			return CompletableFuture.supplyAsync(() -> "User details for user ID " + userId);
		});

		// Third CompletableFuture: Combines the results of userIdFuture and userDetailsFuture
		//####
		//thenAcceptBoth -> BiConsumer 
		CompletableFuture<Void> combinedFuture1 = userIdFuture.thenAcceptBoth(userDetailsFuture,
				(userId, userDetails) -> {
					System.out.println("User ID: " + userId + ", User Details: " + userDetails);
				});

		// Wait for all CompletableFutures to complete
		combinedFuture1.join();
		
		//######
		//thenCombine -> BiFunction
		// Combine the results of both CompletableFutures using thenCombine
        CompletableFuture<String> combinedFuture2 = userIdFuture.thenCombine(userDetailsFuture,
                (userId, userName) -> "User ID: " + userId + ", User Name: " + userName);

        // Join and print the combined result
        System.out.println(combinedFuture2.join());
	}
}
