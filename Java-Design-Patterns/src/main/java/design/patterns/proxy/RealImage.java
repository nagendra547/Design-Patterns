/**
 * 
 */
package design.patterns.proxy;

/**
 * @author nagendra
 *
 */
public class RealImage implements Image{

	private String name;
	
	public RealImage(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void displayImage() {
		System.out.println("Doing complicated tasks");
		System.out.println("Display Real Image Successfully");
	}

}
