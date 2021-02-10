class GfG
{
    public int SumofLeafNodes(Node node)
    {
         if(node==null)
        {
            return 0;
        }
        int sum=0;
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
                if(n.left==null&&n.right==null)
                {
                  sum=sum+n.data;  
                }
                z--;
             }
         }
         return sum;
    }
}
