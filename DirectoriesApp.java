package com.advance.filehandling;
import java.io.File;
import java.util.Arrays;

public class DirectoriesApp {

	public static void main(String[] args) {
		File businessBookDirectory=new File("Ebooks\\Business");
		if(businessBookDirectory.mkdirs()) {
			System.out.println("Directory is created");
		}else {
			System.out.println("cannot create directory.");
		}
		businessBookDirectory.deleteOnExit();
		
		File FileHandlingDirectory=new File("src\\com\\advanced\\filehandling\\");
		System.out.println("files in the filehandling directory");
		System.out.println(Arrays.toString(FileHandlingDirectory.list()));
		System.out.println(Arrays.toString(FileHandlingDirectory.listFiles()));

	}
}




