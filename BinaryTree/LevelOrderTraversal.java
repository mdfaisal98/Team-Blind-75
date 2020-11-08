class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {
    
        List<List<Integer>> res = new ArrayList();
        Queue<TreeNode> q = new LinkedList();
        if(root == null)
            return res;
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> sub = new ArrayList();
            for(int i=0;i<size;i++){
                TreeNode cur = q.poll();
                if(cur.left!=null)
                    q.add(cur.left);
                if(cur.right!=null)
                    q.add(cur.right);
                sub.add(cur.val);
            }
            res.add(sub);
        }
        
        return res;
    }
}