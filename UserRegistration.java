package com.userregistration.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	static Scanner scanner = new Scanner(System.in);
	
	/*
     * First name must start with Capital letter and has minimum 3 length
     */
	public static boolean firstNameValidate(String firstName) {
       
       boolean result = Pattern.matches("[A-Z][a-z]{2,}", firstName);
       return result;
	} 
	/*
     * Last name must start with Capital letter and has minimum 3 length
     */
    public static boolean lastNameValidate(String LastName) {
	    
        boolean result = Pattern.matches("[A-Z][a-z]{2,}", LastName); 
        return result;
    }
    /*
     * Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions
     * enter a valid email - E.g. abc.xyz@bl.co.in
     */
    public static boolean emailValidate(String email) {
        
        boolean result = Pattern.matches("^(abc)[.][a-z]+[@](bl)[.](co)[.][a-z]+$", email);
        return result;
    }
    /*
     * Phone number starts with 2 digit country code followed by space and 10 digit number
     */
   
    public static boolean phoneNumberValidate(String phNum) {
       
        boolean result = Pattern.matches("[1-9]{2}[\s][0-9]{10}", phNum);
        return result;
    }
    /*
     * Password contains minimum 8 characters, atleast 1 capital Letter, atleast 1 small Letter, atleast 1 numeric value and exact one Special character( like !@#$%^&+= )
     */
    public static boolean passwordValidate(String password) {
        
    	boolean result = Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=[^!@#$%^&+=]*[!@#$%^&+=][^!@#$%^&+=]*$)(?=.*[0-9]).{8,}$", password);
    	return result;
    }
}

