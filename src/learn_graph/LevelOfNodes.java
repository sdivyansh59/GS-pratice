package learn_graph;

public class LevelOfNodes {

}


class Solution
{
    //Function to find the level of node X.
    int nodeLevel(int V, ArrayList<ArrayList<Integer>> adj, int X)
    {
        int levelAns = -1;
        
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(0);
        int level = 0;
        int size = q.size();
        if(X == 0) return level;
        boolean[] isVisited = new boolean [V];
        isVisited[0] = true;
        
        while( q.size()> 0){
            //System.out.println(level+" -> " );
            
            while(size >0){
                
                int currentNode = q.poll();
                //System.out.print(currentNode+" ");
                for( int edgeNode : adj.get(currentNode)){
                    if(edgeNode == X){
                        levelAns = level+1;
                        
                        return levelAns;
                    }
                    if(!isVisited[edgeNode]){
                        q.add(edgeNode);
                        isVisited[edgeNode]= true;
                    }
                    
                }
                
                size --;
            }
            //System.out.println();
            level++;
            size = q.size();
        }
        return levelAns;
    }
}