package learn_graph;

public class BfsOfGraph {

}



class Solution {
    // Function to return the adjacency list for each vertex.
    public ArrayList<ArrayList<Integer>> printGraph(
        int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<ArrayList<Integer>> outputAdjList = new ArrayList<ArrayList<Integer>>();
        
        for ( int i=0 ;i< adj.size();i++){
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(i);
            for ( int smallListValue : adj.get(i)){
                list.add(smallListValue);
            }
            outputAdjList.add(list);
        }
        
         return outputAdjList;
        
    }
}