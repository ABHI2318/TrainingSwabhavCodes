package com.aurionpro.FilesSystem;

import java.io.FileInputStream;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       FileInputStream inputs=new FileInputStream("D:\\SWABHAV_TRAINING\\COREJAVA\\FileSystem\\src\\com\\aurionpro\\FilesSystem\\demo");
       int count=0;
       
       int ch;
       
       int word_count=1;
       int line_count=1;
       while((ch=inputs.read())!=-1) {
    	   System.out.print((char)ch);
    	   count++;
    	  if((char)ch==' '|| (char)ch=='\t'||(char)ch=='\n') 
    		  word_count++;
    	   if((char)ch=='\n')
    		   line_count++;
       }
       System.out.println();
       System.out.println("the number of chars are "+count);
       System.out.println("the number of words are "+word_count);
       System.out.println("the number of lines are "+line_count);
       inputs.close();
	}

}
