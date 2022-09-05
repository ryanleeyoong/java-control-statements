package javaControlStatements;

public class ifStatement {
	
	public static void main(String[]args){
				
		SimpleIf simpleIfObj = new SimpleIf();
		IfElse ifElseObj = new IfElse();
		
		simpleIfObj.simpleIfMethod();
		ifElseObj.IfElseMethod();
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
			System.out.println("\n" + "If-else {" + "\n\n" + " x is 5");
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
