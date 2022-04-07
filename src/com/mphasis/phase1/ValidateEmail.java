package com.mphasis.phase1;
import java.util.*;
import java.util.Scanner; ;
public class ValidateEmail {
	  
	    public static void main(String[] args) 
	    { 
	      String[] strArray = { "rosy@gmail.com", "priya@gmail.com", "alen@gmail.com", "john@gmail.com", "siya@gmail.com" };
	        boolean found = false;
	        int index = 0;
	        Scanner sc= new Scanner(System.in);
	        
	        String searchStr;
	        System.out.println("Enter the email id to search");
	        searchStr=sc.next();
	       for (int i = 0; i <strArray.length; i++) {
	       if(searchStr.equals(strArray[i])) {
	            index = i; found = true; 
	            break;
	            }
	        }
	       if(found)
	          System.out.println(searchStr +" found at the index "+index);
	        else
	          System.out.println(searchStr +" not found in the array");
	 
	    }
	
}
