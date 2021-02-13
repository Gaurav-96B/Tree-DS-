class Tree
{
	Node lca(Node root, int n1,int n2)
	{
	if(root==null)
	    {
	        return null;
	    }
	    if(root.data==n1||root.data==n2)
	    {
	        return root;
	    }
	    Node leftlca=lca(root.left,n1,n2);
	    Node rightlca=lca(root.right,n1,n2);
	    if(leftlca!=null&&rightlca!=null)
	    {
	       return root; 
	    }
	    if(leftlca!=null)
	    {
	        return leftlca;
	    }
	    else
	    {
	        return rightlca;
	    }
	    	

	}
}

