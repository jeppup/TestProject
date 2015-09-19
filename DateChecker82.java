/* Grupp 82: Anton Fluch och Lovisa Lindström */
import java.util.Scanner;
 
class DateChecker82 {
  public static void main(String[] args) {
    int month, day;
 
    Scanner input = new Scanner(System.in);
 
    System.out.println("Ange månad>");
 
    month = input.nextInt();
    
    while (month > 12){
    	System.out.println("Felaktig månad.");
    	System.out.println("Ange månad>");
    	month = input.nextInt();
    }
 
    if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ) {
      System.out.println("Ange dag i månaden>");
      
      day = input.nextInt();
      
      while (day < 1 || day > 31) {
    	  System.out.println("Felaktig dag i månaden.");
    	  System.out.println("Ange dag i månaden>");
    	  day = input.nextInt();
      }
      	if (day <= 31 ) {
      		System.out.println("Korrekt datum.");
      	}
      	
    }
    else if (month == 4 || month == 6 || month == 9 || month == 11) {
    	System.out.println("Ange dag i månaden>");
    	
    	day = input.nextInt();
    	
    	while (day < 1 || day > 30) {
    		System.out.println("Felaktig dag i månaden.");
    		System.out.println("Ange dag i månaden>");
    		day = input.nextInt();
    	}
    		if (day <= 30) {
    			System.out.println("Korrekt datum.");
    		}
    }
    else {
    	System.out.println("Ange dag i månaden");
    	
    	day = input.nextInt();
    	
    	while (day < 1 || day > 28){
    		System.out.println("Felaktig dag i månaden.");
    		System.out.println("Ange dag i månaden>");
    		day = input.nextInt();
    	}
    	if (day <= 28) {
    		System.out.println("Korrekt datum.");
    	}
    }
  }
}