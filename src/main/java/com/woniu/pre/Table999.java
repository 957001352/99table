package com.woniu.pre;

public class Table999 {
	public static void mode99(int m,int n) {
		int i = 1;
		while(i<=n) {
			System.out.print(i+"*"+n+"="+n*i+"\t");
			i++;
		}
		System.out.println();
		n++;
		if(n<=m) {
			mode99(m,n);
		}
	}
}
