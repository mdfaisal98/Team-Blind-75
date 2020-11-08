class Solution {
    int m,n;

    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;
        
        char[] ch = word.toCharArray();
        
        for(int i=0;i<m;i++) {
            for(int j = 0;j<n;j++) {
                if(board[i][j] == ch[0]) {
                    if(dfs(i,j,board,ch,0))
                        return true;
                }
            }
        }
        
        return false;
    }
    
    public boolean dfs(int i ,int j , char[][] board,char[] str,int index) {
        if(index == str.length)     // If word found return true
            return true;

        if( i<0 || j<0 || i>=m || j>= n || board[i][j]!=str[index])
            return false;

        char temp = board[i][j];
        board[i][j] = '#';
        
        if (dfs(i+1,j,board,str,index+1) ||dfs(i-1,j,board,str,index+1) ||dfs(i,j+1,board,str,index+1) || dfs(i,j-1,board,str,index+1) )  // If word found in any of the four directions
        return true;

        board[i][j] = temp;     // Backtrack and change character to original
        return false;
    }
}