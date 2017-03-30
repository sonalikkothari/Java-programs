package Collect;

import java.util.ArrayList;
import java.util.List;

public class PatternEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] input = {"a1","a2","a3","a4","a5","b1","b2","b3","b4","b5"};
		
		List<String> arrInputLst = new ArrayList<String> ();
		
		int j =5;
		for(int i =0;i<5;i++) {
			
			arrInputLst.add(input[i]);
			arrInputLst.add(input[j]);
			j++;
			
		}
		
		for(String disp: arrInputLst) {
			System.out.println(disp);
		}
	}

}
