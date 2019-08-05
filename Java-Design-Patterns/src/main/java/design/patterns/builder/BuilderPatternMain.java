/**
 * 
 */
package design.patterns.builder;

/**
 * @author nagendra
 * 
 *         A Creational design patterns which is used to create the instance of
 *         a needed object with the required values.
 *
 */
public class BuilderPatternMain {
	private PersonBuilder builder;
	
	public BuilderPatternMain(PersonBuilder builder) {
		this.builder= builder;
	}
	
	public Person construct() {
		return builder.setFirstName("Nagendra").setLastName("Kumar").setAge(21).setGender("male").build();
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		PersonBuilder bp = new PersonBuilderImpl();
		BuilderPatternMain main = new BuilderPatternMain(bp);

		System.out.println(main.construct());

	}

}
