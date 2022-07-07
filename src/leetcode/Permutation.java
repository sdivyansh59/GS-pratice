class Solution {
public:
    
    void findPermutaion(vector<int> nums,vector<int> v, vector<vector<int>> &ans){
         if(nums.size()==0){
             ans.push_back(v);
             return;
         }
        
        vector<int> :: iterator it=nums.begin();
        for(int i=0;i<nums.size();i++){
            vector<int> newNums=nums;
            vector<int> :: iterator it=newNums.begin();
            vector<int> newV=v;
            newV.push_back(newNums[i]);
            newNums.erase(it+i);
            findPermutaion(newNums,newV,ans);
           
        }
    }
    
    vector<vector<int>> permute(vector<int>& nums) {
        vector<vector<int>> ans;
        vector<int> v;
        findPermutaion(nums,v,ans);
            return ans;
    }
};