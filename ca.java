package aa;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class ca {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("input : ");
		String input = scanner.next();
		double pinput = Double.parseDouble(input);
		int integerPart = (int)pinput;
		
		ArrayList<Integer> remainderList = new ArrayList<Integer>();
		
		while(integerPart!=0) {
			remainderList.add(integerPart % 2);
			integerPart /= 2;
		}
		
		integerPart = (int)pinput;
		Collections.reverse(remainderList);
		System.out.println(remainderList);
		
		int index = input.indexOf(".");
		String finput = input.substring(index+1);
		System.out.println(finput);
		String finput2 = "0."+finput;
		System.out.println(finput2);
		double finput3 = Double.parseDouble(finput2);
		System.out.println(finput3);
		
		ArrayList<Integer> tmpa = new ArrayList<Integer>();
		for(int i=0; i<31; i++) {
			
			finput3 = finput3 * 2;
			String tmp = Double.toString(finput3);
			tmpa.add(Integer.parseInt(finput2.substring(0, index)));
			if(finput3==1.0) {
				break;
			}
			
		}
		
		System.out.println(tmpa);
	}

}