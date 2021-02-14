class Level_order_traversal
{
   
    static ArrayList <Integer> levelOrder(Node node) 
    {
        ArrayList<Integer>a=new ArrayList<>();
        Queue<Node>q=new LinkedList<>();
        q.add(node);
        while(!q.isEmpty())
        {
            int z=q.size();
            while(z>0)
            {
                Node temp=q.peek();
                a.add(temp.data);
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
        return a;
    }
}





