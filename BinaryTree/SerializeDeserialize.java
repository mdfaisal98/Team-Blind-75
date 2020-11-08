public class Codec {
    
    static String sp = ",";
    static String NN = "X";
    
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        build(root,sb);
        return sb.toString();
    }
    
    public void build(TreeNode root,StringBuilder sb){
        if(root == null){
            sb.append(NN).append(sp);
            return;
        }
        else{
            sb.append(root.val).append(sp);
            build(root.left,sb);
            build(root.right,sb);
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] vals = data.split(sp);
        Queue<String> nodes = new LinkedList<>();
        nodes.addAll(Arrays.asList(vals));
        return buildtree(nodes);
    }
    
    public TreeNode buildtree(Queue<String> nodes){
        String val = nodes.poll();
        if(val.equals(NN))
            return null;
        else{
            TreeNode root = new TreeNode(Integer.valueOf(val));
            root.left = buildtree(nodes);
            root.right = buildtree(nodes);
            return root;
        }
        
    }
}
