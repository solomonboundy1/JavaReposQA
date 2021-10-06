package helloWorldDemo;

// ctrl / makes text into a comment
// all of out code should be in th { } for our class
public class Runner {

	//Make a method that prints out "Hello World"
//	ctrl space, brings up the 'main' method after typing main
	public static void main(String[] args) {
//		Will print hello world  
//		System.out.println("Hello World");
//		System.out.println("Happy Birthday Reece!");
		helloWorld();
		colr();
	}
	
	// Make other methods that are called by our main 
	//Created a method called helloWorld
	//syso + ctrl space autofills System.out.println
	public static void helloWorld() {
		System.out.println("Hello World");
	}
	public static void colr() {
		System.out.println("My favourite colour is Blue");
		
	}
}
