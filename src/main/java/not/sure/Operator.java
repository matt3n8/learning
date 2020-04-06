package not.sure;

public abstract class Operator {
	
	protected double firstValue;
	protected double secondValue;
	protected double result;
	
	abstract public void compute();
	
	public Operator(double first, double second)
	{
		this.firstValue = first;
		this.secondValue = second;
	}
	
	public double getResult()
	{
		return result;
	}
	
	public void printResult()
	{
		System.out.println(result);
	}
}
