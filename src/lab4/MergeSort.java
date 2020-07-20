package lab4;

import java.util.*;

public class MergeSort{
	private final int INSERT = 20;
	int[] arr;
	
	
	public int[] sort(int[] input){
		int n = input.length;
		int[] tempStorage = new int[n];
		arr = input;
		mergeSort(tempStorage,0,n-1);
		return arr;
	}
	

	private void merge(int[] tempStorage, int aPointer, int bPointer, int cBound) {
		int j = 0;
		int lowerBound = aPointer;
		int n = cBound - lowerBound + 1;
		
		int mid = bPointer -1;  
		
		while(aPointer <= mid && bPointer <= cBound){
			if(arr[aPointer] < arr[bPointer]){
				tempStorage[j++] = arr[aPointer++];
			}
			else {
				tempStorage[j++] = arr[bPointer++];
			}
		}
		while(aPointer <= mid) {
			tempStorage[j++] = arr[aPointer++];
		}

		while(bPointer <= cBound){
			tempStorage[j++] = arr[bPointer++];
		}
		for(j=0; j<n; ++j) {
			arr[lowerBound+j] = tempStorage[j];
		}
		
	}
	
	
	void mergeSort(int[] tempStorage, int lower, int upper) {
		if(lower==upper){
			return;
		}
		if(upper-lower <= this.INSERT){
			insertionSort(lower,upper);
		}
		else {
			int mid = (lower+upper)/2;
			mergeSort(tempStorage,lower,mid);  
			mergeSort(tempStorage,mid+1, upper); 
			merge(tempStorage,lower,mid+1,upper); 
		}
	}
	
	private void insertionSort(int lower, int upper) {
		if(arr == null || arr.length <= 1)
			return;
		
		int temp = 0;
		int j = 0;
		for(int i = lower; i <= upper; ++i) {
			temp = arr[i];
			j=i;
			while(j>lower && temp < arr[j-1]){
				arr[j] = arr[j-1];
				j--;
			}
			arr[j]=temp;
		}		
	}	
	public static void main(String[] args) {
		int[] scenario = {1,134,14,-25, 31, 45, 98};
		MergeSort msp = new MergeSort();
		System.out.println(Arrays.toString(scenario));
		msp.sort(scenario);
		System.out.println(Arrays.toString(scenario));
	}


}

