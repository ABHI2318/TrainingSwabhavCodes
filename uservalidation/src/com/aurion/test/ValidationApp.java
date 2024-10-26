package com.aurion.test;

import com.aurion.exceptions.NotValidEmailException;
import com.aurion.exceptions.NotValidPasswordException;
import com.aurion.model.user;

public class ValidationApp {

	public static void main(String[] args) {

        try {user user1 = new user("ankitra@gmail.com","Geeksport@al20");
		System.out.println(user1);

	} catch(NotValidEmailException exception) {
		System.out.println(exception.getMessage());
	} 
      catch(NotValidPasswordException exception) {
    	  System.out.println(exception.getMessage());
      }
        catch(Exception exception) {
        	System.out.println("something went worng");
        }
        
        
		
	}

}
