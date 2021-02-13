class GFG
{
	public static int findMax(Node root)
	{
	Queue<Node>q=new LinkedList<>();
	    q.add(root);
	    int max=Integer.MIN_VALUE;
	    while(!q.isEmpty())
	    {
	       int z=q.size();
	       while(z>0)
	       {
	         Node n=q.peek();
	         max=Math.max(max,n.data);
	         q.poll();
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
	    return max;    
	}
	public static int findMin(Node root)
	{
	    Queue<Node>q=new LinkedList<>();
	    q.add(root);
	    int min=Integer.MAX_VALUE;
	    while(!q.isEmpty())
	    {
	       int z=q.size();
	       while(z>0)
	       {
	         Node n=q.peek();
	         min=Math.min(min,n.data);
	         q.poll();
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
	    return min;
	}
}
