package com.java.st.test;


public class MgicFin {

	public static void main(String[] args) {
		String s="amit";
		String rev="";
		for(int i=s.length()-1; i>=0;i--){
			
			rev+=s.charAt(i);
		}
		System.out.println(rev);
	}

}
