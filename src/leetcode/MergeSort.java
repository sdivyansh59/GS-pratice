package leetcode;

public class MergeSort {

}


public class solution {


public static void mergeSort(int[] input){
		// Write your code here
         merge_sort(input, 0, input.length-1);
		
}
    
public static void merge_sort( int [] arr, int start, int end ) {
	if( start == end ) return ;

	int mid = start + (end-start)/2;
	merge_sort(arr, start, mid);
	merge_sort( arr, mid+1, end);
	merge(arr, start, mid, end);
	
}
    
public static void  merge(int [] arr, int start, int mid , int end){
    int len1 = mid-start+2;
    int [] arr1 = new int[len1];
    arr1[len1-1] = Integer.MAX_VALUE;
    
    int len2 = end-mid+1;
    int []arr2 = new int[len2];
    arr2[len2-1] = Integer.MAX_VALUE;
    
    // copy in arr1
    for( int i=0; i< len1-1; i++){
        arr1[i] = arr[start+i];
    }
    
    // copy in arr2
    for ( int i=0 ; i< len2-1; i++){
        arr2[i] = arr[mid+1+i];
    }
    
    // now compare arr1 and arr2 and merge
    int i = 0;
    int j = 0;
    int k = start;
    while(k<=end){
        // if i reach to the end of ar1 array
        if(i == len1-1){
            while(k<= end){
                arr[k++] = arr2[j++];
            }
            break;
        }
        
        // if j reach to the end of arr2 array
        if(j == len2-1){
            while(k<= end){
                arr[k++] = arr1[i++];
            }
            break;
        }
        
        if(arr1[i] < arr2[j]){
            arr[k++] = arr1[i++];
        }else{
            arr[k++]= arr2[j++];
        }
    }
    
}
    
    
    
    
}
