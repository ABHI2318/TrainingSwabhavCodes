package com.aurionpro.FilesSystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;

public class DetailsOfFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File input=new File("D:\\SWABHAV_TRAINING\\COREJAVA\\FileSystem");
		
		System.out.println("location of file"+input.getAbsolutePath());
		System.out.println("path of file"+input.getPath());
		System.out.println("size of file "+input.length());
		System.out.println("list of files "+input.list());
		System.out.println("name of files "+input.getName());
		System.out.println("can we read it "+input.canRead());
		System.out.println("can we write on it "+input.canWrite());
		System.out.println("create a new directory "+input.mkdir());
		System.out.println("is it a directory "+input.isDirectory());
		
		if(input.isDirectory())
			System.out.println(input.list().length);
		else
			System.out.println("not a directory");
		
		
	}

}
