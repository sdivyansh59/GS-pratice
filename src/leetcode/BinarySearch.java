package leetcode;

public class BinarySearch {

}


public class solution {

	// element - number to be searched
	public static int binarySearch(int input[], int element) {
		return binarySearch(input, 0, input.length-1, element);

	}
    public static int binarySearch(int input[], int start, int end, int element) {
		if(start<= end){
            int mid = start+ (end-start)/2;
            if(input[mid] == element) return mid;
            
            else if(input[mid] > element){ // move left
                return binarySearch(input, start, mid-1, element);  
            }
            return binarySearch(input, mid+1, end, element); 
        }
        
        return -1;

	}
}
