package design.patterns.facade;

/**
 * 
 * @author nagendra
 *
 */
public class RAMInfo {
	private long freeMemory;
	private long maxMemory;

	public void getInfo() {
		freeMemory = Runtime.getRuntime().freeMemory();
		maxMemory = Runtime.getRuntime().maxMemory();
		System.out.println("Here is Memory Info");
		System.out.println("Free Memory: " + freeMemory);
		System.out.println("Max Memory: " + maxMemory);
	}

}
