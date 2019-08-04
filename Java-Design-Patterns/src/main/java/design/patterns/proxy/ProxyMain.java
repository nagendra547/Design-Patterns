/**
 * 
 */
package design.patterns.proxy;

/**
 * @author nagendra
 * 
 *         The access to an object should be controlled.
 * 
 *         Additional functionality should be provided when accessing an object.
 * 
 *         With this pattern, we create an intermediary that acts as an
 *         interface to another resource, e.g., a file, a connection. This
 *         secondary access provides a surrogate for the real component and
 *         protects it from the underlying complexity.
 *
 */
public class ProxyMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Image image = new ProxyImage("my-1MB-Image");
		System.out.println("Getting name: "+ image.getName());
		System.out.println("Displaying Image: ");
		image.displayImage();
	}

}
