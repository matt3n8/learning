package not.sure;

public abstract class Math {
	
	protected double firstValue;
	protected double secondValue;
	protected double result;
	
	abstract public void compute();
	
	public Math(double first, double second)
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
