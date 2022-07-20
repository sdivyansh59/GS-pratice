package learn_graph;

public class FindWheatherPAthExist {

}


class Solution
{
    //Function to find whether a path exists from the source to destination.
    public boolean is_validPath(int x , int y , int N, int M){
        if( x<0 || x>= N || y<0 || y>= M) return false;
        return true;
    }
    
    
    public boolean is_Possible(int[][] grid)
    {
        int N = grid.length;
        int M = grid[0].length;
        boolean [][] isVisited = new boolean [N][M];
        
         // search sourc index and push in queue
        int sourceX = -1;
        int sourceY = -1;
        for( int i=0 ;i< N; i++){
            for (int j=0 ;j<M ; j++){
                if(grid[i][j] == 1){
                    sourceX = i;
                    sourceY = j;
                    break;
                }
            }
        } 
        
        return sourceToDestinationPath(sourceX, sourceY, grid, isVisited);
    }
    
    int []dirX =  {-1,0,1,0}; 
    int []dirY =  {0,1,0,-1};
    
     public boolean sourceToDestinationPath(int x, int y,int[][] grid, boolean [][] isVisited){
         isVisited[x][y] = true;
         
         if(grid[x][y] == 2) return true;
          if(grid[x][y] == 0) return false;
         
         
         for( int i=0 ; i<4 ;i++){
             int X = x+dirX[i];
             int Y =  y+dirY[i];
             if( is_validPath(X,Y,grid.length,grid[0].length)){
                 if(!isVisited[X][Y]){
                     boolean smallAns = sourceToDestinationPath(X,Y,grid,isVisited);
                     if(smallAns) return smallAns;
                 }
             }
         }
         return false;
     }
    
    
}
