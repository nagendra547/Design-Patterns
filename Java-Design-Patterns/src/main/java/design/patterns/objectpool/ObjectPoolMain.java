package design.patterns.objectpool;

/**
 * ObjectPool Design pattern. Primarily helpful in creating the connection pool
 * or threadpool.
 * 
 * Helpful in managing the sharing of resources and improving the performance of
 * JVM. <br>
 * Very powerful when initial rate of creating a resource in JVM is high and so
 * let's create upfront and let's application use it when it needed
 * 
 * @author nagendra
 *
 */
public class ObjectPoolMain {

	public static void main(String a[]) {
		MyTask[] tasks = new MyTask[5];
		for (int i = 1; i <= 5; i++) {
			tasks[i - 1] = new MyTask("Task" + i);
		}
		MyThreadExecutorPool pool = new MyThreadExecutorPool();
		for (int i = 1; i <= 5; i++) {
			pool.executeTask(tasks[i - 1]);
		}

		pool.shutdown();
	}

}
