class Tree
{
    void mirror(Node node)
    {
	if(node==null)
	{
	    return ;
	}
	Queue<Node>q=new LinkedList<>();
	q.add(node);
	while(!q.isEmpty())
	{
	    int z=q.size();
	    while(z>0)
	    {
	        Node n=q.peek();
	        q.poll();
	        Node temp=n.left;
	        n.left=n.right;
	        n.right=temp;
	        if(n.left!=null)
	        {
	            q.add(n.left);
	        }
	        if(n.right!=null)
	        {
	            q.add(n.right);
	        }
	        z--;
	    }
	}
    }
}
