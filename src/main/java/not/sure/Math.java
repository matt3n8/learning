package not.sure;

public abstract class Math {
	
	protected double firstValue;
	protected double secondValue;
	protected double result;
	
	abstract double returnResult();
	
	public Math(double first, double second)
	{
		this.firstValue = first;
		this.secondValue = second;
	}
	
	void printResult()
	{
		System.out.println(result);
	}
}
