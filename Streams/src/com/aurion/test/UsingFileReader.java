package com.aurion.test;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UsingFileReader {
	public static void main(String[]args) throws IOException {
		
		 FileReader fileread=null;
		 BufferedReader bufferread=null;
		 try {
			 fileread=new FileReader("D:\\SWABHAV_TRAINING\\SWABHAV_TRAINING\\COREJAVA\\Streams\\src\\com\\aurion\\test\\name");
		     bufferread=new BufferedReader(fileread);
		     
		     String line;
		     while((line=bufferread.readLine())!=null) {
		    	 System.out.println(line);
		     }
		 }
		 
		 catch(FileNotFoundException fileread1){
			 System.out.println("file not found");
			 
		 }
		 
		 
	}

}
