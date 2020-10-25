class Tree{
    void rightView(Node node) 
    {
        if(node==null)
        {
            return;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(node);
        while(!q.isEmpty())
        {
            int z=q.size();
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
               if(z==0)
               {
                   System.out.print(temp.data+" ");
               }
               
            }
            
        }
        
    }
}

