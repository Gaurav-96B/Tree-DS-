class Solution {
    int height(Node node) {
        if(node==null)
        {
            return 0;
        }
        int height=0;
        Queue<Node>q=new LinkedList<>();
        q.add(node);
        while(!q.isEmpty())
        {
            int z=q.size();
            height++;
            if(z==0)
            {
              break;
            }
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
                z--;
            }
        }
        return height;
        
    }
}
