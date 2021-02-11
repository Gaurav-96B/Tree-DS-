class Tree
{
	int getLevelDiff(Node root)
	{
	   Queue<Node>q=new LinkedList<>();
	   q.add(root);
	   int level=1;
	   int oddsum=0;
	   int evensum=0;
	   while(!q.isEmpty())
	   {
	       int z=q.size();
	       while(z>0)
	       {
	           Node n=q.peek();
	           if(level%2!=0)
	           {
	               oddsum=oddsum+n.data;
	           }
	           if(level%2==0)
	           {
	              evensum=evensum+n.data; 
	           }
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
	       level++;
	   }
	   int diff=oddsum-evensum;
	   return diff;
	}
}
