package com.yash.training;

public class FirstCharacterInString {
	public static void main(String[] args) {
		String str="Happy Birthday dear mangesh";
		
		String[] strArray=str.split(" ");
		for(String s:strArray) {
			System.out.println(s.charAt(0));
		}
		
		
	}

}
