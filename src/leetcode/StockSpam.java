package leetcode;

public class StockSpam {

}



public class Solution {

	public static int[] stockSpan(int[] price) {
		//Your code goes here
        int []ansAr = new int [price.length];
        Stack<Integer> st = new Stack<Integer>();
        st.add(0);
        int index =1;
        ansArr[0] = 1;
        
        while ( index < price.length){
            int stIndex =0;
            if(!st.empty()){
                stIndex= st.peek();
            }
            
            if( price[stIndex] > price[index]){
                ansArr[index] = index-stIndex;
            }else{
                while(!st.empty() && price[st.peek()] < price[index] ){
                    st.pop();
                }
                if(st.empty()){
                    price[index] = index;
                    st.add(index);
                }else{
                    price[index] = index- st.peek();
                }
            }
            
            index++;
        }
        
        return ansArr;
	}

}