//   Extra Space
class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int[] rows = new int[m];       // Stores row indices with zero 
        int[] cols = new int[n];       // Stores column indices with zero
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j] == 0)       
                {
                      rows[i] = 1;
                      cols[j] = 1;
                }
            }        
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                if(rows[i] ==1  || cols[j] == 1)  //    Check if row or col is marked as zero
                    matrix[i][j] = 0;
        }
    }
}

