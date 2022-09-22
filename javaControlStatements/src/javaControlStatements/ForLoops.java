package javaControlStatements;

public class ForLoops {
	
	void SimpleForLoop() {
		
		for(int i=0 ; i<=10; i++) {
			System.out.println(true);
			System.out.println(i);
		}
		
		System.out.println("\n" + false);
	}
	
	void NestedForLoop() {
		
		for(int i=1; i<=3; i++) {
			
			for(int j=1; j<=3; j++) {
				System.out.println(i + " " + j);
			}
			
		}
	}
	
	void Pyramid() {
		
		for(int i=1; i<=10; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
