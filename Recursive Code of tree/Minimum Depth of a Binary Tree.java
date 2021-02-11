class Tree
{
	int minDepth(Node root)
	{
	    if(root==null)
	    {
	        return 0;
	    }
	    if(root.left==null&&root.right==null)
	    {
	        return 1;
	    }
	    if(root.left==null)
	    {
	        return minDepth(root.right)+1;
	    }
	    if(root.right==null)
	    {
	        return minDepth(root.left)+1;
	    }
	    return 1+Math.min(minDepth(root.left),minDepth(root.right));
	}
}


