/**
 * 
 */
package not.sure;

/**
 * @author Matt
 *
 */
public class Subtractor extends Math {
	
	public Subtractor(double first, double second)
	{
		super(first,second);
	}
	
	public void compute()
	{
		result = firstValue - secondValue;
	}
	
	
}
