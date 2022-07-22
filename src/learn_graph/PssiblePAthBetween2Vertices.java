package learn_graph;

public class PssiblePAthBetween2Vertices {

}

class Solution {
    // Function to count paths between two vertices in a directed graph.
    public int countPaths(int V, ArrayList<ArrayList<Integer>> adj, int source,
                   int destination) {
        // Code here
        return dfsSearch(adj,source, destination);
    }
    
    public int dfsSearch( ArrayList<ArrayList<Integer>> adj,int currentNode,int destination){
        if( currentNode == destination) return 1;
        
        int smallAns = 0;
        for( int edgeNode : adj.get(currentNode)){
            smallAns = smallAns +dfsSearch(adj, edgeNode, destination);
        }
        
        return smallAns;
    }
}

