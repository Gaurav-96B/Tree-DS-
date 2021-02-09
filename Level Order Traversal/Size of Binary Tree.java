class Tree
{
	public static int getSize(Node root)
	{
	    if(root==null)
	    {
	        return 0;
	    }
	    Queue<Node>q=new LinkedList<>();
	    q.add(root);
	    int count=0;
	    while(!q.isEmpty())
	    {
	        int z=q.size();
	        while(z>0)
	        {
	            Node temp=q.peek();
	            q.poll();
	            if(temp.left!=null)
	            {
	                q.add(temp.left);
	            }
	            if(temp.right!=null)
	            {
	                q.add(temp.right);
	            }
	            count++;
	            z--;
	        }
	    }
	    return count;
    }
}
