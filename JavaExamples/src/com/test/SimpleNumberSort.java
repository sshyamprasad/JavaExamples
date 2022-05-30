package com.test;

public class SimpleNumberSort {

	void numSort(int num[]) {
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
	}
	
	void displaySorted(int num[]) {
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

	public static void main(String[] args) {
		int num[] = { 7, 10, 3, 4, 2, 6, 8, 5, 9, 5 };
		SimpleNumberSort sort = new SimpleNumberSort();
		sort.numSort(num);
		sort.displaySorted(num);
	}

}
