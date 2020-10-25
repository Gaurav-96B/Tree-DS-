class Level_Order_Traverse
{
    static void levelOrder(Node node) 
    {
        Queue<Node>q=new LinkedList<>();
        q.add(node);
        while(!q.isEmpty())
        {
            int z=q.size();
            while(z>0)
            {
                Node temp=q.remove();
                System.out.print(temp.data+" ");
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
            
            System.out.print("$"+" ");
        }
    }
}
