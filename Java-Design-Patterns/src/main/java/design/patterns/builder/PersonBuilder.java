package design.patterns.builder;

/**
 * 
 * @author nagendra
 * 
 * an interface used to set the values for person
 *
 */
public interface PersonBuilder {

	public PersonBuilder setFirstName(String firstName);

	public PersonBuilder setLastName(String lastName);

	public PersonBuilder setAge(int age);

	public PersonBuilder setGender(String gender);

	public Person build();
}
