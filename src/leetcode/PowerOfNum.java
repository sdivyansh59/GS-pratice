package leetcode;

public class PowerOfNum {

}

public class Solution {

    // assuming n will be +ve num
	public static int power(int x, int n) {
		if(n==0 ) return 1;
        if( n == 1) return x;
        
        int smallAns = 0;
        if( (n&1) == 0){
            smallAns = power(x, n/2);
            smallAns = smallAns * smallAns ;
            
        }else{
            n--;
            smallAns = power(x,n/2);
            smallAns = smallAns * smallAns  * x;
        }
        return smallAns;
		
	}
}