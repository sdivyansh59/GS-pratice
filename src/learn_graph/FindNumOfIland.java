package learn_graph;

public class FindNumOfIland {

}


class Solution {
    // Function to find the number of islands.
    public boolean is_validPath(int x , int y , int N, int M){
        if(x<0 || x>= N || y<0 || y>= M) return false;
        
        return true;
    }
    
    public int numIslands(char[][] grid) {
        // Code here
        int N = grid.length;
        int M = grid[0].length;
        boolean [][] isVisited = new boolean [N][M];
        int ans = 0;
        for( int i=0 ;i< N; i++){
            for ( int j=0 ;j<M ; j++){
                if(grid[i][j] == '1' && !isVisited[i][j]){
                     searchIland(i, j , grid, isVisited);
                     ans++;
                }
            }
        }
        
        return ans;
    }
    int []dirX = {-1,0,1,0,-1,-1,1,1};
    int []dirY = {0,1,0,-1,1,-1,1,-1};
    
    public void  searchIland(int x, int y, char[][] grid, boolean [][] isVisited ){
        isVisited[x][y] = true;
        
        for ( int i=0 ;i< 8 ;i++){
            int X = x+dirX[i];
            int Y = y+dirY[i];
            
            if( is_validPath(X, Y,grid.length,grid[0].length ) && grid[X][Y] !='0' && !isVisited[X][Y]){
                searchIland(X,Y,grid, isVisited);
            }
        }
        
        
        
    }
}
