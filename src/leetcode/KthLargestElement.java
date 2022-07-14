package leetcode;

public class KthLargestElement {

}



import java.util.*;

public class Solution {

	public static int kthLargest(int n, int[] input, int k) {
		// Write your code here
        Queue<Integer> pq = new PriorityQueue<Integer> ();
        for ( int i=0 ;i< k ; i++){
             pq.add(input[i]);
        }
        
        //System.out.println(pq);
        for ( int i= k ; i<n ;i++){
            if( pq.peek() < input[i]){
                pq.poll();
                pq.add(input[i]);
            }
        }
       
        return pq.poll();

	}
}