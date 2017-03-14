package model_steven;

import java.util.ArrayList;

public class ModelS {

	private ArrayList<Integer> seq;
	private int length, time;
	
	public ModelS(ArrayList<Integer> seq, int length, int time){
		this.seq = seq;
		this.length = length;
		this.time = time;
	}
	
	public ArrayList<Integer> run(){
		
		return null;
	}
	
	public int diff(ArrayList<Integer> list1, ArrayList<Integer> list2){
		if(list1.size() != list2.size()){
			System.out.println("Lists are different lengths");
			System.exit(1);
		}
		int total = 0;
		for(int i = 0; i < list1.size(); i++){
			total += Math.abs(list1.get(i) - list2.get(i));
		}
		return total;
	}
}
