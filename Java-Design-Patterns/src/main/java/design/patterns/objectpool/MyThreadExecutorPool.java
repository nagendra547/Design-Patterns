/**
 * 
 */
package design.patterns.objectpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author nagendra
 *
 */
public class MyThreadExecutorPool {

	private ExecutorService executorService;
	private final int NUMBER_THREADS = 5;

	public MyThreadExecutorPool() {
		executorService = Executors.newFixedThreadPool(NUMBER_THREADS);
	}

	public void executeTask(Runnable r) {
		executorService.submit(r);
	}

	public void shutdown() {
		try {
			executorService.awaitTermination(5, TimeUnit.SECONDS);
			executorService.shutdownNow();
			System.out.println("Executor Pool Shutdown successfull");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
