package com.aurion.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

public class StreamFileread {

	public static void main(String[] args) throws IOException {
		String filename="D:\\SWABHAV_TRAINING\\SWABHAV_TRAINING\\COREJAVA\\Streams\\src\\com\\aurion\\test\\name";
		File file=new File(filename);
		try(Stream<String> linesStream=Files.lines(file.toPath())){
			linesStream.forEach(line->{
				System.out.println(line);
			});
		}
	}

}
