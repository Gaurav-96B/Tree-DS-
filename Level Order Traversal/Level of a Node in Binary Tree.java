class Solution
{
    int getLevel(Node node, int data)  
    { 
        if(node==null)
        {
            return 0;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(node);
        int level=0;
        while(!q.isEmpty())
        {
            level++;
            int z=q.size();
            while(z>0)
            {
               Node n=q.peek();
               if(n.data==data)
               {
                   return level;
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
        }
        return 0;
        
    } 

}
