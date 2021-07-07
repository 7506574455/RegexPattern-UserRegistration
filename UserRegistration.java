package regex;

import java.util.Scanner;
import java.util.regex.Pattern;
        //created class
public class UserRegistration {

	static Scanner scanner = new Scanner(System.in);
           
	    //main method
    public static void main(String[] args) {
    
    	firstNameValidate();
    	lastNameValidate();
    	emailValidate();
     }	
    	/*
         * First name must start with Capital letter and has minimum 3 length
         */
    	public static void firstNameValidate() {
            System.out.print("Enter first Name : ");
            String firstName = scanner.next();
            System.out.println(Pattern.matches("[A-Z][a-z]{2,}", firstName));
    	} 
    	/*
         * Last name must start with Capital letter and has minimum 3 length
         */
        public static void lastNameValidate() {
    	    System.out.print("Enter last Name : ");
            String lastName = scanner.next();
            System.out.println(Pattern.matches("[A-Z][a-z]{2,}", lastName));                
        }
        /*
         * Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions
         * enter a valid email - E.g. abc.xyz@bl.co.in
         */
        public static void emailValidate() {
            String email = "abc.xyz@bl.co.in";
            System.out.println("Email : " + email);
            System.out.println(Pattern.matches("^(abc)[.][a-z]+[@](bl)[.](co)[.][a-z]+$", email));
        }
}
       
