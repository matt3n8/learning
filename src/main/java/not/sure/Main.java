package not.sure;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter equation you want solved: ");
		String equationLine = myScanner.nextLine();
		double value1 = 0;
		double value2 = 0;
		String symbol = "";
		String[] parts;
		
		try
		{
			parts = equationLine.split(" ");
			value1 = Double.parseDouble(parts[0]);
			symbol = parts[1];
			value2 =  Double.parseDouble(parts[2]);
		}
		catch( NumberFormatException e)
		{
			System.out.println("Error: two numbers not found");
		}
		double result;
		String resultString;
		Operator mathDriver = MathDriver.getOperator(value1, value2, symbol);
		try
		{
			mathDriver.compute();
			result = mathDriver.getResult();
			resultString = "The answer is " + result;
			System.out.println(resultString);
		}
		catch(NullPointerException e)
		{
			System.out.println("Something went wrong :( input incorrectly formatted?");
		}
		
		myScanner.close();
	}

}
