/**
 * 
 */
package design.patterns.strategy;

/**
 * @author nagendra
 *
 */
public class StrategyPatternMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Context add = new Context(new OperationAdd());
		Context multiply = new Context(new OperationMultiply());
		int x =12, y =15;
		System.out.println("Executing Add Strategy "+add.executeStrategy(x, y));
		
		System.out.println("Executing Multiply Strategy "+multiply.executeStrategy(x, y));

	}

}
