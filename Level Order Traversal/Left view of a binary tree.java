class Tree
{
    
    void leftView(Node root)
    {
      if(root==null)
        {
            return;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int z=q.size();
            int z1=q.size();
            while(z>0)
            {
               Node temp=q.remove();
               if(z==z1)
               {
                   System.out.print(temp.data+" ");
               }
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
