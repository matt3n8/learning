package not.sure;

public class Adder extends Operator {

	public Adder(double first, double second) {
		super(first, second);
	}

	@Override
	public void compute() {
		result = firstValue * secondValue;

	}

}
