package com.demo.services;

public class ArrayServicesImpl implements ArrayServices {

	@Override
	public int[] rotate(int[] arr, int i) {
		int n = arr.length;
		if (n == 0)
			return arr;

		i = i % n; 
		if (i == 0) {
			return arr;
		}

		reverse(arr, 0, n - 1); 
		reverse(arr, 0, i - 1); 
		reverse(arr, i, n - 1); 
		return arr;
	}

	private void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}

}
