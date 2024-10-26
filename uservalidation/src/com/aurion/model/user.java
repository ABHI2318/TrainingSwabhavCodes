package com.aurion.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.aurion.exceptions.NotValidEmailException;
import com.aurion.exceptions.NotValidPasswordException;

public class user {
	private String email;
	private String password;
	
	
	   public user(String email,String password) {
		   	   if(isValidEmail(email)==false) 
			   throw new NotValidEmailException();
			   this.email=email;
			   if(isValidPassword(password)==false) 
				   throw new NotValidPasswordException();
				   this.password=password;
		   
	   }
	   
	   
	   @Override
	public String toString() {
		return "user [email=" + email + ", password=" + password + "]";
	}


	public static boolean isValidPassword(String password) {
			 String regex = "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";
			 Pattern p = Pattern.compile(regex);
			 if (password == null) {
		            return false;
		        }
			 Matcher m = p.matcher(password);
			 return m.matches();
			 
		}
		  public static boolean isValidEmail(String email) {
			 String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
	                 "[a-zA-Z0-9_+&-]+)*@" + 
	                 "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
	                 "A-Z]{2,7}$"; 
	                   
						Pattern pat = Pattern.compile(emailRegex); 
						if (email == null) 
						 return false; 
						return pat.matcher(email).matches(); 
			 
		}
	    
}
