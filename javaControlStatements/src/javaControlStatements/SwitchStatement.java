package javaControlStatements;

public class SwitchStatement {

	//Specifying month number  
    int month=2;    
    String monthString="";  
    
    //Specifying branch  
    char branch = 'C';                 
    int collegeYear = 4;  
	
	void SwitchStatementMethod() {
		
	    //Switch statement  
	    switch(month){ 
	    
	    //case statements within the switch block  
	    case 1: 
	    	monthString="1 - January";  
	    break;    
	    
	    case 2: 
	    	monthString="2 - February";  
	    break;    
	    
	    case 3: 
	    	monthString="3 - March";  
	    break;    
	    
	    case 4: 
	    	monthString="4 - April";  
	    break;  
	    
	    case 5: 
	    	monthString="5 - May";  
	    break;  
	    
	    case 6: 
	    	monthString="6 - June";  
	    break;  
	    
	    case 7: 
	    	monthString="7 - July";  
	    break;    
	    
	    case 8: 
	    	monthString="8 - August";  
	    break;  
	    
	    case 9: 
	    	monthString="9 - September";  
	    break;    
	    
	    case 10: 
	    	monthString="10 - October";  
	    break;    
	    
	    case 11: 
	    	monthString="11 - November";  
	    break;    
	    
	    case 12: 
	    	monthString="12 - December";  
	    break;    
	    
	    default:System.out.println("Invalid Month!");
	    }    
	    //Printing month of the given number  
	    System.out.println("\n"+ "Switch Statement { \n\n" + monthString + "\n\n}");  
	}    
	
	//Nested switch statement
	void NestedSwitchStatementMethod() {
		
		 switch( collegeYear )  
	        {  
	            case 1:  
	                System.out.println("English, Maths, Science");  
	                break;  
	            case 2:  
	                switch( branch )   
	                {  
	                    case 'C':  
	                        System.out.println("Operating System, Java, Data Structure");  
	                        break;  
	                    case 'E':  
	                        System.out.println("Micro processors, Logic switching theory");  
	                        break;  
	                    case 'M':  
	                        System.out.println("Drawing, Manufacturing Machines");  
	                        break;  
	                }  
	                break;  
	            case 3:  
	                switch( branch )   
	                {  
	                    case 'C':  
	                        System.out.println("Computer Organization, MultiMedia");  
	                        break;  
	                    case 'E':  
	                        System.out.println("Fundamentals of Logic Design, Microelectronics");  
	                        break;  
	                    case 'M':  
	                        System.out.println("Internal Combustion Engines, Mechanical Vibration");  
	                        break;  
	                }  
	                break;  
	            case 4:  
	                switch( branch )   
	                {  
	                    case 'C':  
	                        System.out.println("\n"+ "Nested Switch Statement { \n\n" + "Data Communication and Networks, MultiMedia" + "\n\n}");  
	                        break;  
	                    case 'E':  
	                        System.out.println("Embedded System, Image Processing");  
	                        break;  
	                    case 'M':  
	                        System.out.println("Production Technology, Thermal Engineering");  
	                        break;  
	                }  
	                break;  
	        } 
	}
}

