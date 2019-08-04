/**
 * 
 */
package design.patterns.singleton;

public class SingletonDesignMain {

	public static void main(String[] args) {
		SingletonDesign sd1 = SingletonDesign.getInstance();
		SingletonDesign sd2 = SingletonDesign.getInstance();
		System.out.println(sd1 == sd2);

		

	}

}
