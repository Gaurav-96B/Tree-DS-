class Tree
{
	void printSibling(Node node)
	{
	    if(node==null)
	    {
	        return;
	    }
	    Queue<Node>q=new LinkedList<>();
	    q.add(node);
	    Set<Integer>s=new TreeSet<>();
	    int found=0;
	    while(!q.isEmpty())
	    {
	      int z=q.size() ;
	      while(z>0)
	      {
	          Node temp=q.remove();
	          if(temp.left!=null)
	          {
	              q.add(temp.left);
	          }
	          if(temp.right!=null)
	          {
	              q.add(temp.right);
	          }
	          if(temp.left!=null&&temp.right==null)
	          {
	              found=1;
	              s.add(temp.left.data);
	          }
	          if(temp.left==null&&temp.right!=null)
	          {
	              found=1;
	              s.add(temp.right.data);
	          }
	          z--;
	      }
	    }
	    if(found==0)
	    {
	        System.out.print("-1");
	    }
	    else
	    {
	    for(int i:s)
	    {
	        System.out.print(i+" ");
	    }
	    }
	}
}





