package JavaConcepts.CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThenApplyAsyncDemo2 {

	public static void main(String[] args) {
        // Create a custom executor with 2 threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Create a CompletableFuture that asynchronously fetches a product ID
        CompletableFuture<Integer> productIdFuture = CompletableFuture.supplyAsync(() -> {
        	System.out.println("productIdFuture execution started..."+Thread.currentThread().getName());
            // Simulate fetching product ID from a remote service
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("productIdFuture execution ended..."+Thread.currentThread().getName());
            return 12345;
        }, executor);

        // Use thenApplyAsync with a custom executor to transform the product ID into a product name asynchronously
        CompletableFuture<String> productNameFuture = productIdFuture.thenApplyAsync(productId -> {
        	System.out.println("productNameFuture execution started..."+Thread.currentThread().getName());
            // Simulate fetching product name using the product ID
            // This operation will execute asynchronously on the custom executor
            return fetchProductName(productId);
        }, executor);

        // Block and get the result
        try {
            String productName = productNameFuture.get();
            System.out.println("Product Name: " + productName); // Output: Product Name: Laptop
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Shutdown the executor
        executor.shutdown();
    }

    // Simulated method to fetch product name using product ID
    private static String fetchProductName(int productId) {
        // Simulate fetching product name from a remote service
    	System.out.println("fetchProductName execution started..."+Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Laptop";
    }

}
