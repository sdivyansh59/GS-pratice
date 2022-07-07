class Solution {
public:
    
    bool possible(int val ,int I,int J,vector<vector<char>>& board){
        //check vertical
        for(int i=0,j=J; i<9 ;i++){
            if(int(board[i][j])-48 == val){
                return false;
            }
        }
        
        // check horizontal
        for(int i=I,j=0; j<9 ;j++){
            if(int(board[i][j])-48 == val){
                return false;
            }
        }
        
        // a\check square matri 
        int si = (I/3)*3;
        int sj = (J/3)*3;
        
        for(int i=si; i<si+3 ;i++){
            for(int j=sj ;j<sj+3 ;j++){
                 if(int(board[i][j])-48 == val){
                    return false;
                 }
            }
        }
        
        return true;
    }
    
    
    
    bool helper(vector<vector<char>>& board,int i,int j){
        if(j==9){
            j=0;
            i+=1;
        }
        if(i==9){
            // cout<<"Solved";
            return true;
        }
        
        
        if(board[i][j]=='.'){
            for(int val =1 ;val<=9 ;val++){
                if(possible(val,i,j,board)){
                    board[i][j]=char(val+48);
                    bool flag =helper(board,i,j+1);
                    if(flag){
                        return true;
                        break;
                    }
                    board[i][j]='.';
                    
                }
            }
            return false;
        }else{
          return   helper(board,i,j+1);
        }
        
        
        return true;  // not reachable  line
    }
    
    
    
    void solveSudoku(vector<vector<char>>& board) {
        int i=0;
        int j=0;
        helper(board,i,j);
    }
};