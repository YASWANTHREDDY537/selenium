package yas;

import java.util.Scanner;

public class DRR {

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter");
		String s1 =s.next();
		String temp="";
		int count=0;
		int i;
		int j;
		for(i=0;i<s1.length();i++) {
			
			for(j=0;j<s1.length();j++) {
				if(s1.charAt(i)==s1.charAt(j)){
					count++;
					
				}
			}
			if(count>0) {
				temp=temp+s1.charAt(i);
				
			}
			System.out.println(temp);
		}
	
		
		
	}
}
