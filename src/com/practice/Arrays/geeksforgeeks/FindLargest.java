/**
 * 
 */
package com.practice.Arrays.geeksforgeeks;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 
 */
public class FindLargest {

	/**
	 * @param args https://www.geeksforgeeks.org/java-exercises/# 15 find the
	 *             largest element of an array
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 7, 2, 5, 1, 4 };

		int max = Arrays.stream(a).max().getAsInt();
		int min = Arrays.stream(a).min().getAsInt();
		System.out.println("Max of an array is = " + max + " \n" + "Min of an array is = " + min);

		Arrays.sort(a);

		System.out.println(a[a.length - 1]);

	}

}
