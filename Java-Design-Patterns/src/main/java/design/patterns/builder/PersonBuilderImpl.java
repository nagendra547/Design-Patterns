/**
 * 
 */
package design.patterns.builder;

/**
 * @author nagendra
 *
 *         actual implementation which fills the value for Person
 */
public class PersonBuilderImpl implements PersonBuilder {
	private Person person;

	public PersonBuilderImpl() {
		person = new Person();
	}

	@Override
	public PersonBuilder setFirstName(String firstName) {
		person.setFirstName(firstName);
		return this;
	}

	@Override
	public PersonBuilder setLastName(String lastName) {
		person.setLastName(lastName);
		return this;
	}

	@Override
	public PersonBuilder setAge(int age) {
		person.setAge(age);
		return this;
	}

	@Override
	public PersonBuilder setGender(String gender) {
		person.setGender(gender);
		return this;
	}

	@Override
	public Person build() {
		return person;
	}

}
