package ownExceptions;

public class Maths {
	
	public void multiply(int a, int b) throws MultiplyByThreeException{
		
		int result;
		
		if(a == 3 || b == 3) {
			MultiplyByThreeException m = new MultiplyByThreeException();
			throw m;
		}
		result = a * b;
		System.out.println("The result of the number is: " + result);
	} 
	
	public void divide(int a, int b) throws divideException, DivideSevenException{
		
		int result;
		
		if(a < b) {
			divideException n = new divideException();
			throw n;
		}
		if(a == 7 || b == 7) {
			DivideSevenException o = new DivideSevenException();
			throw o;
		}
		result = a / b;
		System.out.println("The result of the number is: " + result);
	} 

}
