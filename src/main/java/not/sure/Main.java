package not.sure;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter equation you want solved: ");
		String equationLine = myScanner.nextLine();
		String[] parts = equationLine.split(" ");
		double value1 = Double.parseDouble(parts[0]);
		String symbol = parts[1];
		double value2 = Double.parseDouble(parts[2]);
		
		double result;
		String resultString;
		Math mathDriver = null;
		boolean isFunctioning = true;
		
		switch(symbol) {
		case "+":
			mathDriver = new Adder(value1,value2);
			break;
		case "-":
			mathDriver = new Subtractor(value1,value2);
			break;
		case "*":
			mathDriver = new Multiplier(value1,value2);
			break;
		default:
			isFunctioning = false;
			break;
		}
		
		if(isFunctioning) {
			mathDriver.compute();
			result = mathDriver.getResult();
			resultString = "The answer is " + result;
		}
		else {
			resultString = "something went wrong here :(";
		}
		
		System.out.println(resultString);
		myScanner.close();
	}

}
