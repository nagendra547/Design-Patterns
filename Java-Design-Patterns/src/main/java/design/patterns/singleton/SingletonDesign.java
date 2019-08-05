package design.patterns.singleton;

import java.io.Serializable;

/**
 * The famous Singleton design pattern. Ofcourse it's creational
 * @author nagendra
 *
 */
public class SingletonDesign implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1012768095239065121L;
	private static SingletonDesign singletonDesign = null;

	private SingletonDesign() {
	}

	/**
	 * Double lock singleton class
	 * @return
	 */
	public static synchronized SingletonDesign getInstance() {
		if (singletonDesign == null) {
			synchronized (SingletonDesign.class) {
				singletonDesign = new SingletonDesign();
			}
		}
		return singletonDesign;
	}
	

	protected Object readResolve() {
		return getInstance();
	}

}
