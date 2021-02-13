class Tree {
    boolean hasPathSum(Node root, int S) {
        if(root==null)
        {
            return false;
        }
        S=S-root.data;
        if(root.left==null&&root.right==null&&S==0)
        {
          return true;  
        }
        return hasPathSum(root.left,S)||hasPathSum(root.right,S);
    }
}
