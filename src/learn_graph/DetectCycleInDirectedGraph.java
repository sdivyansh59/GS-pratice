package learn_graph;

public class DetectCycleInDirectedGraph {

}

class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        
        boolean []isVisited = new boolean [V];
        boolean [] recurStack = new boolean [V];
        int start = 0;
        for( int stat = 0 ; start< V; start++){
            if(!isVisited[start]){
                if(dfsToCheckCyclic(start, adj, isVisited, recurStack)){
                    return true;
                }
            }
            
        }
        return  false;
    }
    
    public boolean dfsToCheckCyclic(int start,ArrayList<ArrayList<Integer>> adj, boolean [] isVisited,  boolean []recurStack){
        recurStack[start] = true;
        isVisited[start] = true;
        
        for(int edgeNode : adj.get(start)){
            if(recurStack[edgeNode] == true){
                return true;
            }
            if(isVisited[edgeNode] == false){
                 boolean smallAns = dfsToCheckCyclic(edgeNode, adj, isVisited, recurStack);
                 if(smallAns ) return smallAns;
            }
        }
        
        recurStack[start] = false;
        return false;
    }
}