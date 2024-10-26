package com.aurionpro.FilesSystem;

import java.io.FileInputStream;
import java.io.IOException;

public class FileCreate {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream inputstream=new FileInputStream("D:\\SWABHAV_TRAINING\\COREJAVA\\FileSystem\\src\\com\\aurionpro\\FilesSystem\\demo");
		int ch;
		while((ch=inputstream.read())!=-1){
			System.out.print((char)ch);
		}
       inputstream.close();
	}

}
