package com.interview.programs;

public class FibonnaciSeries {

	public static void main(String[] args) {
		int n=10;
		int f,f1=0,f2=1;
		System.out.print(f1+" "+f2);
		int i=0;
		while( i<=n) {
			f=f1+f2;
			System.out.print(" "+f);
			f1=f2;
			f2=f;
			i++;
		}

	}

}
