package com.practice.Algorithms;

public class SlidingWindow {

	static int maxOfSubArray(int a[], int k) {
		int wsum = 0;
		int msum = Integer.MIN_VALUE;

		for (int i = 0; i < k; i++) {
			wsum += a[i];
		}
		for(int i= k;i<a.length; i++) {
			wsum= wsum-a[i-k] +a[i];
			msum= Math.max(msum, wsum);
		}

		return msum;

	}

	public static void main(String args[]) {

		int[] a = { 2, 9, 31, -4, 21, 7 };
		int k = 3;
		System.out.println(maxOfSubArray(a, k));
	}

}
