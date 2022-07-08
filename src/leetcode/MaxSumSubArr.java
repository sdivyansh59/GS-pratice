package leetcode;

public class MaxSumSubArr {

}

class Solution {
public:
//     int maxSubArray(vector<int>& nums) {
//         int n=nums.size();
//         if(n==1) return nums[0];
        
//         int max,sum;
//         sum=nums[0];
//         max=sum;
        
//         for(int i=1;i<n;i++){
//             if(sum+nums[i]>=sum ){
//                 sum<0 ? sum=nums[i] : sum+=nums[i];
              
//             }else{  // -ve sum case
//                // sum=nums[i]; 
//                 sum+nums[i]>0 ? sum+=nums[i] : sum=nums[i];
//             }
//             if(sum>max){
//                 max=sum;
//             }
//         }
        
        
//         return max;
//     }
    // 2nd method dp approach || good method
    int maxSubArray(vector<int>& nums) {
        int n=nums.size();
        int max=nums[n-1];
        int sum=max;
        
        //dp kind of approach
        for(int i=n-2;i>=0;i--){
            sum= (nums[i]>sum+nums[i]) ? sum=nums[i] : sum+=nums[i];
            
            if(sum>max) max=sum;   
        }
       return max; 
    }
};