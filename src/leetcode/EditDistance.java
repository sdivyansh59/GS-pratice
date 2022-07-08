package leetcode;

public class EditDistance {

}

class Solution {
    
public:
    
    
int findMinEditDistance(string wordOne,string  wordTwo, vector< vector< int> > &dp, int i, int j){
	if( wordOne[0] == '\0' || wordTwo[0] =='\0'){
//		if( wordOne[0] == '\0' && wordTwo[0] =='\0')  return 0;
		if(wordOne[0] == '\0')  return wordTwo.length();
		if(wordTwo[0] == '\0') return wordOne.length();
	}
	
	// check dp
	if(dp[i][j] != -1) return dp[i][j];
	// equal char
	if(wordOne[0] == wordTwo[0]){
		return 0 + findMinEditDistance(wordOne.substr(1), wordTwo.substr(1),dp, i+1, j+1);
	}
	
	// not found
	// remove 
	// cout<<"a";
	int removeAns = 1 +  findMinEditDistance( wordOne.substr(1),wordTwo, dp, i+1, j); 
	int replaceAns = 1 + findMinEditDistance( wordOne.substr(1),wordTwo.substr(1), dp, i+1, j+1);
	int insertAns = 1 +  findMinEditDistance( wordOne,wordTwo.substr(1),dp,i, j+1);
	
	int minimum = min (removeAns, min(replaceAns, insertAns));
	dp[i][j] = minimum;
	return minimum;
}

    
    int minDistance(string word1, string word2) {
     
    vector< vector< int> > dp (word1.length(), vector<int>(word2.length(),-1));
	
	int i=0, j=0;
    return findMinEditDistance(word1, word2, dp, i, j);
    }
};
