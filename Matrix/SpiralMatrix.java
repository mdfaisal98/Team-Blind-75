class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        if(matrix.length == 0)
            return res;

        ArrayList<Integer> res = new ArrayList<>();
        int rs=0,cs=0,re=matrix.length-1,ce=matrix[0].length-1;
        
        while(rs<=re && cs<=ce) {
            for(int i=cs;i<=ce;i++)     //  Right 
                res.add(matrix[rs][i]);
            rs++;
            
            for(int i=rs;i<=re;i++)     // Down
                res.add(matrix[i][ce]);
            ce--;
            
           if(rs<=re){
                for(int i=ce;i>=cs;i--)     // Left
                res.add(matrix[re][i]);
            re--;
           }
            
            if(cs<=ce){
                for(int i=re;i>=rs;i--)     // Up
                    res.add(matrix[i][cs]);
                cs++; 
            }
        }
        
        return res;
    }
}