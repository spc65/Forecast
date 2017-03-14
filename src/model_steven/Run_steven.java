package model_steven;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Run_steven {

	/*
	 * time is in seconds
	 * length is the size of returned arraylist
	 */
	public ArrayList<Integer> run(String filename, int length, int time) {
		ArrayList<Integer> list = initArray(filename);
		return null;
	}
	
	public ArrayList<Integer> initArray(String filename){
		Scanner s = null;
		try {
			s = new Scanner(new File(filename));
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
			e.printStackTrace();
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (s.hasNext()){
			list.add(s.nextInt());

		}
		s.close();
		return list;
	}

}
