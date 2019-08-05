/**
 * 
 */
package design.patterns.facade;

/**
 * @author nagendra
 * 
 * 		   This comes under structural design pattern
 * 
 *         So, As the name suggests, it means the face of the building. The
 *         people walking past the road can only see this glass face of the
 *         building. They do not know anything about it, the wiring, the pipes
 *         and other complexities. It hides all the complexities of the building
 *         and displays a friendly face.
 * 
 * 
 *         In Java, the interface JDBC can be called a facade because, we as
 *         users or clients create connection using the “java.sql.Connection”
 *         interface, the implementation of which we are not concerned about.
 *         The implementation is left to the vendor of driver.
 * 
 * 
 *         https://www.geeksforgeeks.org/facade-design-pattern-introduction/
 * 
 * 
 *         The facade pattern is appropriate when you have a complex system that
 *         you want to expose to clients in a simplified way,
 * 
 */
public class Facade {
	private OsInfo osInfo = new OsInfo();
	private UserInfo userInfo = new UserInfo();
	private RAMInfo ramInfo = new RAMInfo();
	
	/**
	 * this is the only method is exposed to user
	 */
	public void getSystemInfo() {
		osInfo.getInfo();
		userInfo.getInfo();
		ramInfo.getInfo();
	}

}
