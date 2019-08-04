/**
 * 
 */
package design.patterns.facade;

/**
 * @author nagendra
 *
 */
public class UserInfo {
	private String userName ;
	private String userHome;
	
	public void getInfo() {
		userName = System.getProperty("user.name");
		userHome = System.getProperty("user.home");

		System.out.println("User Name : "+userName);
		System.out.println("User Home "+ userHome);
	}

}
