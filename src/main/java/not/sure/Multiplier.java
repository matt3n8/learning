package not.sure;

public class Multiplier extends Operator {

	public Multiplier(double first, double second) {
		super(first, second);
	}

	public void compute() {
		result = firstValue * secondValue;
	}

}
