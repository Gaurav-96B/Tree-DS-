class GfG{
    public void nodeAtOdd(Node root)
     {
       if(root==null)
         {
             return;
         }
         Queue<Node>q=new LinkedList<>();
         q.add(root);
         int l=0;
         while(!q.isEmpty())
         {
             int z=q.size();
             l++;
             while(z>0)
             {
                Node temp=q.peek();
                if(l%2!=0)
                {
                    System.out.print(temp.data+" ");
                }
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
     }
}
