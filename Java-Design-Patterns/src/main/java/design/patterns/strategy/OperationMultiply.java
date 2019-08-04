package design.patterns.strategy;

/**
 * 
 * @author nagendra
 *
 */
public class OperationMultiply implements Strategy {

	@Override
	public int operation(int x, int y) {
		return x*y;
	}

}
