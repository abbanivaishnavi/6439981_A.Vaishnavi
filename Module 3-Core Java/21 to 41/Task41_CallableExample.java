import java.util.concurrent.*;
import java.util.*;

public class que41_CallableExample {
    public static void main(String[] args) {
        // Create a fixed thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Create a list of Callable tasks
        List<Callable<String>> tasks = new ArrayList<>();

        // Add 5 tasks
        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            tasks.add(() -> {
                Thread.sleep(1000); // Simulate work
                return "Task " + taskId + " completed by " + Thread.currentThread().getName();
            });
        }

        try {
            // Submit all tasks and get a list of Futures
            List<Future<String>> results = executor.invokeAll(tasks);

            // Iterate over Futures to get results
            for (Future<String> result : results) {
                System.out.println(result.get()); // Blocks until result is available
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown(); // Always shut down the executor
        }
    }
}
