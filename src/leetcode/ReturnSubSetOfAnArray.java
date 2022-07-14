package leetcode;

public class ReturnSubSetOfAnArray {

}


import java.util.*;
public class solution {

	// Return a 2D array that contains all the subsets
	public static int[][] subsets(int input[]) {
        int n = input.length;
        ArrayList<Integer> smallList = new  ArrayList<Integer>();
        List<  ArrayList<Integer> > ansList = new  ArrayList<  ArrayList<Integer> >();
        
		subsets(input, 0,smallList, ansList );
        
       // System.out.println(ansList);
        int [][]ansArr = new int[ansList.size()][]; 
        for ( int i = 0 ; i<ansList.size(); i++){
            ansArr[i] = new int[ansList.get(i).size()];
            for ( int j= 0; j< ansList.get(i).size();j++){
                ansArr[i][j] = ansList.get(i).get(j);
            }
        }
		return ansArr;
	}
    
    public static void  subsets(int []input,int index,ArrayList<Integer> smallList,  List< ArrayList<Integer> > ansList) {
		if(index == input.length) {
            //System.out.println(smallList);
            ArrayList<Integer> cloneSmallList = new ArrayList<Integer>(smallList);
            ansList.add(cloneSmallList);
           // System.out.println(ansList);
            return ;
        }
        
        // leave
        subsets(input, index+1,smallList, ansList );
        
        // take
        smallList.add(input[index]);
        subsets(input, index+1,smallList, ansList );
        smallList.remove(smallList.size()-1);
        

	}
}
