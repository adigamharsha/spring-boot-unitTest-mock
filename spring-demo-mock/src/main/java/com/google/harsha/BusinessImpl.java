package com.google.harsha;

public class BusinessImpl {

	public int retrieveLargestNumber(int ar[]) {
		int x = Integer.MIN_VALUE;
		for (int i : ar) {
			if (i > x) {
				x = i;
			}
		}
		return x;

	}

}
