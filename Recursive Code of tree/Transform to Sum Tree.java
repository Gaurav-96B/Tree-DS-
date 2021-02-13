class Tree{
    public void toSumTree(Node root){
     if(root==null)
{
    return;
}
if(root.left==null&&root.right==null)
{
    root.data=0;
}
else
{
    int leftsum=0;
    int rightsum=0;
    if(root.left!=null)
    {
      leftsum=root.left.data;
      toSumTree(root.left);
      leftsum=leftsum+root.left.data;
    }
    if(root.right!=null)
    {
      rightsum=root.right.data;
      toSumTree(root.right);
      rightsum=rightsum+root.right.data;
    }
    root.data=leftsum+rightsum;
    
}
}   

}
