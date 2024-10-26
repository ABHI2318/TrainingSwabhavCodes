package com.aurion.enums;

public class enumPOC {
	
	public enum status{
		virat,rohit,dhoni,bumrah;
	}

	public static void main(String[] args) {
	    
        status[]ss=status.values();
           for(status s:ss) {
        	   System.out.println(s);
        	   System.out.println(s+" "+s.ordinal());
        	   System.out.println(s.hashCode());
        	   
           }
	}

}
