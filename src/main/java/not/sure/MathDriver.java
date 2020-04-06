/**
 * 
 */
package not.sure;

/**
 * @author Matt
 *
 */
public class MathDriver {

	/**
	 * 
	 */
	public MathDriver() {
		// TODO Auto-generated constructor stub
	}
	
	public static Operator getOperator(double value1, double value2, String symbol)
	{
		Operator operator = null;
		switch(symbol) {
			case "+":
				operator = new Adder(value1,value2);
				break;
			case "-":
				operator = new Subtractor(value1,value2);
				break;
			case "*":
				operator = new Multiplier(value1,value2);
				break;
			case "^":
				operator = new Exponentiator(value1,value2);
				break;
			default:
				operator = null;
				break;
		}
		return operator;	
	}

}
