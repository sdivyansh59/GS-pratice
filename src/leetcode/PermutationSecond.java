class Solution {
public:
    void find(vector<int> nums, vector<int> smallAns, vector<vector<int>> &ans){
        if(nums.size()==0) {
            ans.push_back(smallAns);
            return ;
        }
        
        int prev=INT_MAX;
        for(int i=0;i<nums.size();i++){
            if(nums[i]!=prev){
                vector<int> newNums=nums;
                vector<int> :: iterator it;
                it=newNums.begin();
                
                vector<int> newSmallAns=smallAns;
                newSmallAns.push_back(newNums[i]);
                newNums.erase(it+i);
                
                
                find(newNums,newSmallAns,ans)  ; 
                prev=nums[i];    
            }
        }
    }
    
    
    vector<vector<int>> permuteUnique(vector<int>& nums) {
        vector<int> smallAns;
        vector<vector<int>> ans;
        sort(nums.begin(),nums.end());
        find(nums,smallAns,ans);
        return ans;   
    }
};