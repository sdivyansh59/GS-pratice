package leetcode;

public class QuickSort {

}


/*
To apply the method explained in the hint video, we have to add two more parameters in the function call. This can be done by calling a helper function from given function. The helper function can have three parameters: array, start index, end index.  

Skeleton code to achieve this:
public class Solution {
	public static void quickSort(int[] input, int startIndex, int endInedx) {
		// your code goes here
	}

	public static void quickSort(int[] input) {
		quickSort(input, 0, input.length - 1);
	}

}

*/


public class Solution {

public static void quickSort(int[] input) {
    
	quickSort(input, 0, input.length-1);
}

public static void quickSort(int[] input, int start, int end) {
	if( start< end){
        int x = partition(input, start, end);
        quickSort(input,start, x-1);
        quickSort(input, x+1, end);
    }
}

public static int partition(int [] arr, int start , int end){
    int pivot = arr[end];
    int i=-1;
    int j = 0;
    
    while ( j <= end){
        if(arr[j] <= pivot){
            int temp = arr[j];
             arr[j]= arr[++i] ;
            arr[i] = temp;
        
        }
        j++;
    }
    
    return i; // i apna place le chuka hai
}

}