package com.yash.training;

public class Palindrome {
	public static void main(String[] args) {
		String str="abc";
		char[] strArray=str.toCharArray();
		String rev="";
		for(int i=strArray.length-1;i>=0;i--) {
			rev=rev+strArray[i];
		}
		if(str.equals(rev)) {
			System.out.println(str+": This String is palindrom");
		}
		else {
			System.out.println(str+""
					+ ":this String is not Palindrom");
		}
	}

}
