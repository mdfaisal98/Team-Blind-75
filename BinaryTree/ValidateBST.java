class Solution {
    public boolean isValidBST(TreeNode root) {
        return check(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    
    public boolean check(TreeNode root,Long min,Long max) {
        if(root == null)
            return true;
        
        if( min < root.val && root.val < max )
            return ( check(root.left,min,(long)root.val) && check(root.right,(long)root.val,max) );
        else
            return false;
    }
}