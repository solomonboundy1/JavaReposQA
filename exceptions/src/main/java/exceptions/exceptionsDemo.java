package exceptions;

import ownExceptions.Maths;
import ownExceptions.MultiplyByThreeException;
import ownExceptions.divideException;
import ownExceptions.DivideSevenException;

public class exceptionsDemo {
	
	public static void main(String[] args) {
		
//		try {
//			int a = 30;
//			int b = 1;
//			int c = a/b;
//			System.out.println("Result = " + c);
//		} catch(ArithmeticException e){
//			System.out.println("You can't divide by zero you muppet");
//		}
		
		Maths m = new Maths();
//		try {
//			m.multiply(4,6);
//		} catch (MultiplyByThreeException e) {
//			System.out.println("Cannot multiply a number by 3!");
//			e.printStackTrace();
//		}
		try {
		try {
			m.divide(3, 7);
		} catch (divideException f) {
			System.out.println("Cannot divide a bigger num!");
			f.printStackTrace();
		}
		} catch (DivideSevenException g) {
			System.out.println("Cannot divide by seven");
			g.printStackTrace();
		}
	}

}
