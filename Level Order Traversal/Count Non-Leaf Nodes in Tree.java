class GFG
{

	int countNonLeafNodes(Node node)
	{
	 if(node==null)
        {
            return 0;
        }
        int count=0;
         Queue<Node>q=new LinkedList<>();
         q.add(node);
         while(!q.isEmpty())
         {
             int z=q.size();
             while(z>0)
             {
                Node n=q.peek();
                q.poll();
                if(n.left!=null)
                {
                  q.add(n.left);
                  
                }
                if(n.right!=null)
                {
                    q.add(n.right);
        
                }
                if(n.left!=null||n.right!=null)
                {
                    count++;
                }
                z--;
             }
         }
         return count;
	}
	
	
}
