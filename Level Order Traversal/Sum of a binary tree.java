class BinaryTree
{
    static int sumBT(Node head){
        if(head==null)
        {
            return 0;
        }
        int sum=0;
        Queue<Node>q=new LinkedList<>();
        q.add(head);
        while(!q.isEmpty())
        {
            int z=q.size();
            while(z>0)
            {
                Node n=q.peek();
                sum=sum+n.data;
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
        return sum;
    }
}
