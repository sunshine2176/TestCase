package com.david.s;

public class QuickSort {

	public static int partition(int[] array,int left, int right){
		int temp = array[left];
		while(left < right){
			while(left < right && array[right] >= temp)
				right--;
			if(left < right)
				array[left++] = array[right];
			while(left < right && array[left] <= temp)
				left++;
			if(left < right)
				array[right--] = array[left];
			
		} 
		array[left] = temp;
		return left;
	}
	
	public static int[] quickSort(int[] array,int left,int right){
		if(left < right){
			int t = partition(array, left, right);
			quickSort(array, left, t-1);
			quickSort(array, t + 1, right);
		}
		return array;
	}
	
	public static void main(String[] args){
		int[] b = {4,2,5,8,6,1};
		int[] bb = quickSort(b, 0, b.length - 1);
		for (int i : bb) {
			System.out.println(i);
		}
	}
}
