package regex;

import java.util.Scanner;
import java.util.regex.Pattern;
        //created class
public class UserRegistration {

	static Scanner scanner = new Scanner(System.in);
           
	    //main method
    public static void main(String[] args) {
    
    	firstNameValidate();
    	
     }	
    	/*
         * First name must start with Capital letter and has minimum 3 length
         */
    	public static void firstNameValidate() {
            System.out.print("Enter first Name : ");
            String firstName = scanner.next();
            System.out.println(Pattern.matches("[A-Z][a-z]{2,}", firstName));
    	}    
}        
