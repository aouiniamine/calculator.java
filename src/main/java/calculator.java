import java.util.Scanner;

public class calculator {
	private Scanner sr = new Scanner(System.in);
	public static void main (String args[]) {
		
		calculator cal = new calculator();
		
		System.out.println(cal.runCalculation());
		
		
	}
	private int printOperations() {
		System.out.println("For addition write: 1");
		System.out.println("For subtraction press: 2");
		System.out.println("To multiply press: 3");
		System.out.println("For division press 4");
		int opNumber = sr.nextInt();
		return opNumber;
	}
	private int runCalculation() {
		
		System.out.println("write number for calculation");
		int num1 = sr.nextInt();
		System.out.println("write second number for calculation");
		int num2 = sr.nextInt();
		int opN = printOperations();
		return runOp(num1, num2, opN);
		
	
	}
	private int runOp (int num1,int num2,int opN) {
		switch(opN) {
		case 1: 
			return num1 + num2;
		case 2:
			return num1 - num2;
		case 3:
			return num1 * num2;
		case 4:
			return num1 / num2;
		default:
			System.out.println("what you've written isn't a correct operation number");
			int newOpN = printOperations();
			
			return runOp(num1, num2, newOpN);
			
		}
		
	}
}