class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null)
            return false;
        
        if(s.val == t.val){
            boolean found = isSame(s,t);
            if(found)
                return true;
        }
        
        return ( isSubtree(s.left,t) || isSubtree(s.right,t));
    }
    
    public boolean isSame(TreeNode s,TreeNode t){
        if(s == null && t == null)
            return true;
        
        if(s == null || t == null)
            return false;
        
        if(s.val == t.val){
            return (isSame(s.left,t.left) && isSame(s.right,t.right));
        }
        else
            return false;
    }
}