package design.patterns.facade;

/**
 * 
 * @author nagendra
 *
 */
public class OsInfo {
	
	private String osName;
	private String osInfo;

	public void getInfo() {
		osName = System.getProperty("os.name");
		osInfo = System.getProperty("os.info");

		System.out.println("OS Name "+ osName);
		System.out.println("Os Info "+ osInfo);
	}

}
