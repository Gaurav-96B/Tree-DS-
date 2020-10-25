class Tree
{
    int countLeaves(Node node) 
    {
        if(node==null)
        {
            return 0;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(node);
        int count=0;
        while(1==1)
        {
            int z=q.size();
            if(z==0)
            {
                return count;
            }
            while(z>0)
            {
                Node temp=q.peek();
                q.remove();
                if(temp.left!=null)
                {
                    q.add(temp.left);
                }
                if(temp.right!=null)
                {
                    q.add(temp.right);
                }
                if(temp.left==null&&temp.right==null)
                {
                    count++;
                }
                z--;
            }
        }
        
    }
}
