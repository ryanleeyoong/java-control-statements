package javaControlStatements;

public class MainClass {
	
	public static void main(String[]args){
		
		//DECISION MAKING STATEMENTS
			//Objects declared here are instances of classes, object = instance.
			IfStatement IfObj = new IfStatement();
			
			IfObj.SimpleIfMethod();
			IfObj.IfElseMethod();
			IfObj.IfElseIfMethod();
			IfObj.NestedIfMethod();
			
			SwitchStatement switchObj = new SwitchStatement();
			switchObj.SwitchStatementMethod();
		}
}
