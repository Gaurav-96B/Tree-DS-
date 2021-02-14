class Tree
{
    int getMaxWidth(Node root)
    {
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        int max1=Integer.MIN_VALUE;
        while(!q.isEmpty())
        {
          int z=q.size();
          max1=Math.max(max1,z);
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
             z--;
          }
        }
        return max1;
    }		
}
