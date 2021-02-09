class Tree
{
     ArrayList<Integer> Kdistance(Node root, int k)
     {
         
      if(root==null)
         {
             return null;
         }
         ArrayList<Integer>a=new ArrayList<>();
         Queue<Node>q=new LinkedList<>();
         q.add(root);
         int l=0;
         while(!q.isEmpty())
         {
             int z=q.size();
             while(z>0)
             {
                 Node temp=q.peek();
                 if(l==k)
                 {
                   a.add(temp.data);
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
             l++;
         } 
         return a;
     }
}
