package com.practice.Arrays;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
	public static void main(String[] args) {

		Integer a1[] = { 1, 4, 6, 7, 5 };
		int a[] = { 1, 4, 6, 7, 5 };
		System.out.println("This is the original format of the array");
		printArray(a);
		System.out.println("This is using an extra array or secondary array ");
		reverseArrayusingASecondArray(a);
		System.out.println("\n");
		System.out.println("This is the reversal of the array using swapping technique");
		reversetheArraywithoutSecondArray(a);

		reverseUsingCollections(a1);
		String names[] = { "chavhan", "pritam" };
		reverseStringArray(names);

		reverseUsingStringBuilder(names);
	}

	private static void reverseUsingStringBuilder(String[] names) {
		// reversing String array using the StringBuilder method
		// String names[]={"chavhan", "pritam"};
		StringBuilder stringbuild = new StringBuilder();
		for (int i = names.length; i > 0; i--) {
			stringbuild.append(names[i - 1]).append(" ");
		}
		System.out.println(Arrays.asList(stringbuild));

		String[] reversedArray = stringbuild.toString().split(" ");
		System.out.println("This is the String Build Version " + Arrays.asList(stringbuild));
		System.out.println("This is the String Array Version " + Arrays.toString(reversedArray));

	}

	private static void reverseStringArray(String[] names) {
		// TODO Auto-generated method stub

		// method to reverse array of String
		// String names[]={"chavhan", "pritam"};

		List<String> stringList = Arrays.asList(names);
		System.out.println(Arrays.toString(names));
		Collections.reverse(stringList);
		System.out.println(stringList);

	}

	private static void reverseUsingCollections(Integer[] a1) {
		// TODO Auto-generated method stub
		// create the list of the given array and use the available reverse method()

		// Arrays.asList(a);
		Collections.reverse(Arrays.asList(a1));
		System.out.println(Arrays.toString(a1));

	}

	private static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));
		// another way of printing an array
		// for (int j=0;j<a.length;j++){
		// System.out.print(a[j] + " ");
		// }
	}

	private static void reversetheArraywithoutSecondArray(int[] a) {

		for (int i = 0; i < a.length / 2; i++) {

			int temp = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = temp;
		}
		printArray(a);

	}

	private static void reverseArrayusingASecondArray(int arr[]) {
		int b[] = new int[arr.length];
		int i = 0;
		for (i = 0; i < arr.length; i++) {
			b[i] = arr[arr.length - 1 - i];
		}
		printArray(b);
	}
}
