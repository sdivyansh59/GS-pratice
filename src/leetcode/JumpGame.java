class Solution {
public:
    
    int find(int index,vector<int>& nums,vector<int>& dp){
        if(index==nums.size()-1) return 1;
        
         if(nums[index]==0 || dp[index]==INT_MAX) return INT_MAX;
        
        
        if(dp[index]!=0) return dp[index]+1;
        
       
        for(int i=1;i<=nums[index] && i+index<nums.size() ;i++){
            int x=find(index+i,nums,dp);
            if(dp[index]==0 || dp[index]>x){
                dp[index]=x;
            }
            
        }
            if(dp[index]==INT_MAX) return INT_MAX;
            
            return dp[index]+1;
        
         
    }
    
    int jump(vector<int>& nums) {
       vector<int> dp(nums.size());
       int index=0;
       dp[nums.size()-1]=1;
        
       int ans= find(index,nums,dp);
       return ans-1;
    }
};