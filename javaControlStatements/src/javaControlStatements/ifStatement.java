package javaControlStatements;

public class ifStatement {
	
	public static void main(String[]args){
				
		SimpleIf simpleIfObj = new SimpleIf();
		IfElse ifElseObj = new IfElse();
		IfElseIf ifElseIfObj = new IfElseIf();
		
		simpleIfObj.simpleIfMethod();
		ifElseObj.IfElseMethod();
		ifElseIfObj.IfElseIfMethod();
	}
	
}

//the class for simple if statements
class SimpleIf {
	int x = 5;
	int y = 6;
	
	void simpleIfMethod() {
		if(x+y > 10) {
			System.out.println("Simple if {" + "\n\n" + " x + y is larger then 10");
			
			}
		
		System.out.println("\n"+" Program exits simple if block and continue executing code below" 
		+ "\n\n" + "}");
	}
	
}

//the class for if-else statements
//additional = is for assigning values, while == "is equal to"
class IfElse {
	int x = 5;
	int y = 6;
	
	void IfElseMethod() {
		if(x == 5) {
			System.out.println("\n" + "If-else {" + "\n\n" + " x is 5 || Program does not enter else block when condition is satisfied");
		}
		
		else {
			System.out.println("does not else, condition is satisfied");
		}
		
		if(y == 5) {
			System.out.println("enters else as condition is not satisfied");
		}
		
		else {
			System.out.println("\n"+" y is not 5 || Program enters else block when condition is unsatisfied" 
					+ "\n\n" + "}");
		}
	}
}

//the class for if-else-if ladder 
class IfElseIf {
	int x = 5;
	int y = 6;
	
	void IfElseIfMethod() {
		if(x == 5) {
			System.out.println("\n" + "If-else-if {" + "\n\n" + " x is 5 || Program does not enter else-if & else block when condition is satisfied");
		}
		
		else if( x + y == 11) {
			System.out.println("x + y is 11");
		}
		
		else if(y == 6) {
			System.out.println("y is 6");
		}
		
		else {
			System.out.println("else statement reached");
		}
		
		System.out.println("\n" + "}");
	}
}
