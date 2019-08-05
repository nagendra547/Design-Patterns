/**
 * 
 */
package design.patterns.objectpool;

/**
 * @author nagendra
 *
 */
public class MyTask implements Runnable{
	private String name;
	
	 public MyTask(String name) {
		 this.name = name;
	}

	@Override
	public void run() {
		
		System.out.println("Executing Task : "+name+ " , Thread Name: "+Thread.currentThread().getName());
		
	}

}
