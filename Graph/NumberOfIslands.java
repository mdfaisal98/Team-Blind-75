class Solution {
    
    int m,n;
    
    public int numIslands(char[][] grid) {
        m = grid.length;
        if(m == 0)
            return 0;
        n = grid[0].length;
        
        int res=0;
        
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(grid[i][j] == '1') {
                    res++;
                    dfs(grid,i,j);
                }
            }
        }
        
        return res;
    }
    
    public void dfs(char[][] G,int i,int j) {
        if(i <0 || i>=m || j<0 || j>=n || G[i][j] == '0') 
            return;
        
        G[i][j] = '0';
        dfs(G,i+1,j);
        dfs(G,i-1,j);
        dfs(G,i,j+1);
        dfs(G,i,j-1);
    }
}