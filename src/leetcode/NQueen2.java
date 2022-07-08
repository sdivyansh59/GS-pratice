package leetcode;

public class NQueen2 {

}


class Solution {
public:
    bool checkPossible(int I,int J,vector<vector<bool> > &board){
        // vertivcal
        for(int i=0 ,j=J; i<board.size();i++){
            if(board[i][j]){
                return false;
            }
        }
        // horizontal
        for(int i=I ,j=0; j<board.size();j++){
            if(board[i][j]){
                return false;
            }
        }
        
        // 2nd diag Up
        for(int i=I,j=J; i>=0 && j<board.size() ; i-- , j++){
             if(board[i][j]){
                return false;
            }
        }
        
       // 2nd diag down
        for(int i=I,j=J; j>=0 && i<board.size() ; i++ , j--){
             if(board[i][j]){
                return false;
            }
        }
        
        // 1diag up
        for(int i=I,j=J; i>=0 && j>=0 ; i-- , j--){
             if(board[i][j]){
                return false;
            }
        }
        
         for(int i=I,j=J; i<board.size() && j<board.size() ; i++ , j++){
             if(board[i][j]){
                return false;
            }
        }
        
        
        return true;
    }
    
    
    void nQueenSolution(vector<vector<bool> > &board,int i,int &ansCount){
        if(i == board.size()){
            ansCount++;
            return ;
        }
        
        for(int j =0; j< board.size(); j++ ){
            if(checkPossible(i,j,board)){
                board[i][j]=true;
                nQueenSolution(board,i+1,ansCount);
                 board[i][j]=false;
            }
        }
    }
    
    int totalNQueens(int n) {
        vector<vector<bool> > board (n, vector<bool> (n,false));
        int i=0;
        int ansCount =0;
        nQueenSolution(board,i,ansCount);
        return ansCount;
    }
};