class GfG
{
    
    public int getCount(Node node, int bud)
    {
        if(node==null)
        {
            return 0;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(node);
        int level=0;
        int budget=0;
        int count=0;
        while(!q.isEmpty())
        {
             level++;
            int z=q.size();
            while(z>0)
            {
                Node n=q.peek();
                if(n.left==null&&n.right==null)
                {
                  budget=budget+level;
                if(budget<=bud)
                {
                    count++;
                }
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
        return count;
    }
}
