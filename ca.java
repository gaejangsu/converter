package aa;

import java.util.Scanner;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.*;

class ca {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("input your number : ");
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
		
		int index = input.indexOf(".");
		String finput = input.substring(index+1);
		String finput2 = "0."+finput;
		double finput3 = Double.parseDouble(finput2);
	
		
		ArrayList<Integer> tmpaf = new ArrayList<Integer>();
		for(int i=0; i<31; i++) {
			finput3 = finput3 * 2.0;
			tmpaf.add((int)finput3);
			String tmp1 = Double.toString(finput3);
			int index2 = tmp1.indexOf(".");
			String tmp2 = tmp1.substring(index2+1);
			String tmp3 = ("0."+tmp2);
			finput3 = Double.parseDouble(tmp3);

			if(finput3==1.0) {
				break;
			}
			
		}
		
		finput3 = Double.parseDouble(finput2);
		
		ArrayList<Integer> tmpad = new ArrayList<Integer>();
		for(int i=0; i<63; i++) {
			finput3 = finput3 * 2.0;
			tmpad.add((int)finput3);
			String tmp1 = Double.toString(finput3);
			int index2 = tmp1.indexOf(".");
			String tmp2 = tmp1.substring(index2+1);
			String tmp3 = ("0."+tmp2);
			finput3 = Double.parseDouble(tmp3);

			if(finput3==1.0) {
				break;
			}
			
		}
		
		System.out.println(remainderList);
		System.out.println(tmpaf);
		System.out.println(tmpad);
		
		List<Integer> cf = Stream.of(remainderList, tmpaf)
				.flatMap(x -> x.stream())
				.collect(Collectors.toList());
		
		System.out.println(cf);
		
		List<Integer> cd = Stream.of(remainderList, tmpad)
				.flatMap(x -> x.stream())
				.collect(Collectors.toList());
		
		System.out.println(cd);
		
		cf.remove(0);
		cd.remove(0);
		
		System.out.println(cf);
		System.out.println(cd);
		
		System.out.println(cf.get(0));
		System.out.println(cd.get(0));
		
		ArrayList<Integer> msb_of_cf = new ArrayList<Integer>();
		ArrayList<Integer> msb_of_cd = new ArrayList<Integer>();
		msb_of_cf.add(cf.get(0));
		msb_of_cd.add(cd.get(0));
		
		System.out.println(remainderList.size());
		
		int tf = remainderList.size() -1 + 127;
		int td = remainderList.size() -1 + 1023;
		
		ArrayList<Integer> remainderTf = new ArrayList<Integer>();
		ArrayList<Integer> remainderTd = new ArrayList<Integer>();
		
		while(tf!=0) {
			remainderTf.add(tf % 2);
			tf /= 2;
		}
		
		while(td!=0) {
			remainderTd.add(td % 2);
			td /= 2;
		}
		
		Collections.reverse(remainderTf);
		Collections.reverse(remainderTd);
		
		System.out.println(remainderTf);
		System.out.println(remainderTd);
		
		cf.subList(23, cf.size()).clear();
		cd.subList(52, cd.size()).clear();
		
		System.out.println();
		
		System.out.println(msb_of_cf);
		System.out.println(msb_of_cd);
		System.out.println(remainderTf);
		System.out.println(remainderTd);
		System.out.println(cf);
		System.out.println(cd);
		
		System.out.print("["+msb_of_cf.get(0)+"][");
	
		for(int i=0; i<remainderTf.size(); i++) {
			System.out.print(remainderTf.get(i));
		}
		
		System.out.print("][");
		
		for(int i=0; i<cf.size(); i++) {
			System.out.print(cf.get(i));
		}
		
		System.out.println("]");
		
		System.out.print("["+msb_of_cd.get(0)+"][");
		
		for(int i=0; i<remainderTd.size(); i++) {
			System.out.print(remainderTd.get(i));
		}
		
		System.out.print("][");
		
		for(int i=0; i<cd.size(); i++) {
			System.out.print(cd.get(i));
		}
		
		System.out.println("]");
	}

}