/**
 * 
 */
package design.patterns.strategy;

/**
 * @author nagendra behavioral design pattern - Define a family of algorithms,
 *         encapsulate each one, and make them interchangeable. Strategy lets
 *         the algorithm vary independently from clients that use it.
 */
public class StrategyPatternMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Context add = new Context(new OperationAdd());
		Context multiply = new Context(new OperationMultiply());
		int x = 12, y = 15;
		System.out.println("Executing Add Strategy " + add.executeStrategy(x, y));

		System.out.println("Executing Multiply Strategy " + multiply.executeStrategy(x, y));

	}

}
