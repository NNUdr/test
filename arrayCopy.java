package com.dr.array;

public class arrayCopy {
public static void main(String[] args) {
	String [] s = {"Mircosoft","IBM","Sun","Apple"};
	String [] sBak = new String[6];
	System.arraycopy(s, 0, sBak, 0, s.length);
	for(int i = 0;i < sBak.length;i++) {
		System.out.println(sBak[i]+"");
	}
}
}
