class Solution {
    
    HashMap<Integer,Integer> map = new HashMap<>();
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<preorder.length;i++) 
            map.put(inorder[i],i);
        
        return build(preorder,0,inorder,0,inorder.length);
    }
    
    public TreeNode build(int[] preorder,int ps,int inorder[],int is,int ie) {
        if(ps >= preorder.length || is>ie)
            return null;
        
        TreeNode root = new TreeNode(preorder[ps]);
        int index = map.get(preorder[ps]);
        root.left = build(preorder,ps+1,inorder,is,index-1);
        root.right = build(preorder,ps+index-is+1,inorder,index+1,ie);
        
        return root;
    }
}