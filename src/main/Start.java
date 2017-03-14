package main;
import java.util.ArrayList;

import model_ana.*;
import model_steven.*;
public class Start {
	
	public static void main(String[] args){
		Run_ana ana = new Run_ana();
		Run_steven steven = new Run_steven();
		ArrayList<Integer> ana_guess = ana.run("aapl_1yr.txt",5,10);
		ArrayList<Integer> steven_guess = steven.run("aapl_1yr.txt",5,10);
	}
	
}
