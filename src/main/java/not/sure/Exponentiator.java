/**
 * 
 */



package not.sure;

/**
 * @author Matt
 *
 */
public class Exponentiator extends Operator {

	public Exponentiator(double first, double second) {
		super(first, second);
	}

	public void compute() {
		result = Math.pow(firstValue,secondValue);

	}

}
