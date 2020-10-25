class Tree
{
    void mirror(Node node)
    {
        Queue<Node>q=new LinkedList<>();
        q.add(node);
        while(!q.isEmpty())
        {
          int z=q.size();
          while(z>0)
          {
            Node temp=q.remove();
            Node temp1=temp.left;
            temp.left=temp.right;
            temp.right=temp1;
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
    }
}
