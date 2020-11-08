class Solution {
    int ans = Integer.MIN_VALUE;
    
    public int maxPathSum(TreeNode root) {
        help(root);
        return ans;
    }
    
    public int help(TreeNode root){
        if(root == null)
            return 0;
        
        int left = help(root.left);
        int right = help(root.right);
        
        int temp = Math.max((Math.max(left,right)+root.val) ,root.val);
        int t1 = Math.max(temp, left+right+root.val );
        ans = Math.max(ans,t1);
        
        return temp;
        
    }
}