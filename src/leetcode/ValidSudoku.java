class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {
        
        // check row
        for(int i=0; i<board.size(); i++){
            vector<bool> v(9,false);
            for(int j=0; j<board[i].size(); j++){
                
                
                if( board[i][j] != '.'){
                    
                     if(v[board[i][j]-49] == false){
                        v[board[i][j]-49] =true;
                    }else{
                        return false;
                    }
                    
                }
                
               
            }
        }
        
        // check column
        for(int j=0 ; j< board[0].size(); j++){
            vector<bool> v(9,false);
            for(int i=0; i< board.size() ; i++){
                 if( board[i][j] != '.'){
                    
                     if(v[board[i][j]-49] == false){
                        v[board[i][j]-49] =true;
                    }else{
                        return false;
                    }
                    
                }
            }
        }
        
        
        
        // check sub square
        for(int i =0 ; i<9 ; i=i+3){
            
            for( int j=0 ; j<9 ;j=j+3){
                vector<bool> v(9,false);
                
                for(int i2= i ; i2<i+3 ; i2++){
                    for(int j2 = j ;j2<j+3 ; j2++){
                        if( board[i2][j2] != '.'){
                    
                             if(v[board[i2][j2]-49] == false){
                                v[board[i2][j2]-49] =true;
                             }else{
                                // cout<<"inside sub matrix"<<i<<" "<<j<<endl;
                                return false;
                            }
                    
                         }
                    }
                }
            }
        }
        
        return true;
    }
};