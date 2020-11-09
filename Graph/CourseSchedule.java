class Solution {
    
    ArrayList<ArrayList<Integer>> adj;
    
    public boolean canFinish(int n, int[][] prerequisites) {
        adj = new ArrayList<>();
        int[] visited = new int[n];
        for(int i=0;i<n;i++)
            adj.add(new ArrayList());
        
        for(int[] pre : prerequisites)
            adj.get(pre[1]).add(pre[0]);
        
        for(int i=0;i<n;i++){
            if(visited[i] == 0){
                if(isCycle(i,visited))
                    return false;
            }
        }
        return true;
    }
    
    public boolean isCycle(int cur,int[] visited){
        if(visited[cur] == 1)       // If it already in processing state.
            return true;
        
        visited[cur] = 1;           // Mark as in processing state.
        for(int node : adj.get(cur)){
            if(visited[node]!=2 && isCycle(node,visited))
                return true;
        }
        visited[cur] = 2;           // Mark as completed.
        return false;
    }
}