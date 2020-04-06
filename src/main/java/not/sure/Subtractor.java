/**
 * 
 */
package not.sure;

/**
 * @author Matt
 *
 */
public class Subtractor extends Operator {
	
	public Subtractor(double first, double second)
	{
		super(first,second);
	}
	
	public void compute()
	{
		result = firstValue - secondValue;
	}
	
	
}
