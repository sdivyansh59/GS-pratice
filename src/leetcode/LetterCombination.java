package leetcode;


class Solution {
public:
    string getString(int n){
        string val;
        switch(n){
            case 1: val= "";
                break;
            case 2: val= "abc";
                break;
            case 3: val ="def";
                break;
            case 4: val ="ghi";
                break;
            case 5: val ="jkl";
                break;
                
            case 6: val ="mno";
                break;
            case 7: val ="pqrs";
                break;
            case 8: val ="tuv";
                break;
            case 9: val ="wxyz";
                break;
            default : val= "";    
        }
        
        return val;
    }
    
    void funPrint(string outputStr, string digits, vector<string> &v){
        if(digits.length()==0){
           // cout<<outputStr<<endl;
            v.push_back(outputStr);
            return ;
        }
        
        string str=getString(int(digits[0])-48);
        
        for(int i=0;i<str.length();i++){
            funPrint(outputStr+str[i],digits.substr(1),v);
        }
        
    }
    
    vector<string> letterCombinations(string digits) {
        vector<string> v;
        if(digits.length()==0) return v;
        //cout<<getString(7);
      //  stringStream geek(digits)
        string outputStr="";
        funPrint(outputStr,digits,v);
        return v;
        
    }
};