/**
 * 
 */
package design.patterns.proxy;

/**
 * @author nagendra
 *
 */
public class ProxyImage  implements Image{
	
	private String name;
	private Image realImage;

	public ProxyImage(String name) {
		this.name = name;
	}
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void displayImage() {
		if (realImage == null) {
			realImage = new RealImage(name);
		}
		realImage.displayImage();
	}

}
