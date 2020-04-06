/**
 * 
 */
package not.sure;

/**
 * @author Matt
 *
 */
public class Adder extends Operator {
	
	public Adder(double first, double second)
	{
		super(first,second);
	}
	
	public void compute()
	{
		result = firstValue + secondValue;
	}
}
