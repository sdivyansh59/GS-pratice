package learn_graph;

public class DetectCycleInUnDirectedGraph {

}


class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int []parentArr = new int [V];
        for( int i=0 ;i<V; i++){
            parentArr[i] = -1;
        }
        
        for( int start = 0 ; start< V; start++){
            if(Bfs(V, adj, parentArr, start)){
                return true;
            }
        }
        return false;
    }
    
    public boolean Bfs(int V,ArrayList<ArrayList<Integer>> adj,int [] parentArr, int start){
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(start);
        boolean []isVisited = new boolean [V];
        isVisited[start]= true;
        
        while(!q.isEmpty()){
            int currNode = q.poll();
            
            for( int edgeNode : adj.get(currNode)){
                
                if(!isVisited[edgeNode]){
                    parentArr[edgeNode] = currNode;
                    isVisited[edgeNode] = true;
                    q.add(edgeNode);
                }else{
                    if(parentArr[currNode] != edgeNode){
                        return true;
                    }
                }
            }
            
            
        }
        return false;
        
    }
}
