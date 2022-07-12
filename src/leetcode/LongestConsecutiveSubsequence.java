package leetcode;

public class LongestConsecutiveSubsequence {

}


import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class Solution {
    
    public static Boolean search(int [] arr, int start,int tempStart){
        for ( int i = 0; i< arr.length; i++){
            if( arr[i] == start){
                return false;
            }
            if( arr[i] == tempStart) return true;
        }
        
        // statement after this line will never rachable
        return false;
    }
	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
		int start = arr[0];
        int end = arr[0];
        
        // push everything inside stack
        Map<Integer, Boolean> map = new HashMap<Integer,Boolean>();
        
        for( int i=0; i< arr.length; i++){
            map.put(arr[i], true);
        }
        
        for(int i=0 ;i < arr.length; i++){
            if(map.get(arr[i])){
                int tempStart = arr[i];
                int tempEnd = arr[i];
                map.put(arr[i], false);
                
                int k = arr[i];
                // move backword
                while(map.containsKey(k-1)){
                    k--;
                    tempStart = k;
                    map.put(k, false);
                }
                
                // move forword
                k = tempEnd ;
                while(map.containsKey(k+1)){
                    k++;
                    tempEnd = k;
                    map.put(k, false);
                }
                
                if( end-start < tempEnd-tempStart){
                    start = tempStart;
                    end = tempEnd;
                }else if ( end-start == tempEnd-tempStart){
                    Boolean swap = search(arr, start, tempStart);
                    // swap == true , then update with new 
                    
                    if( swap== true){
                        start = tempStart;
                    	end = tempEnd;
                    }
                    
                }
            }
        }
        ArrayList<Integer> ansList = new  ArrayList<Integer>();
        
        ansList.add(start);
        ansList.add(end);
        
        return ansList;
        
        
    }
}