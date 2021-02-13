class Tree
{ 
   public static int maxNodeLevel(Node node)
    {
        Queue<Node>q=new LinkedList<>();
        q.add(node);
        int max1=-1;
        int level=0;
        int level1=0;
        while(!q.isEmpty())
        {
            int z=q.size();
            if(z>max1)
            {
                max1=z;
                level1=level;
            }
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
               z--;
            }
            level++;
        }
        return level1;
    }
}
