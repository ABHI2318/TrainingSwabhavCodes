package com.aurionpro.FilesSystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Writer;

public class FileWriting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 FileInputStream inputs=new FileInputStream("D:\\SWABHAV_TRAINING\\COREJAVA\\FileSystem\\src\\com\\aurionpro\\FilesSystem\\demo");
		 FileOutputStream output=new FileOutputStream("abh");
		 int ch;
		 while((ch=inputs.read())!=-1) {
	    	   System.out.print((char)ch);
            output.write(ch);
	}
		 System.out.println("file copied successfully");
		 inputs.close();
		 output.close();
	}
}
