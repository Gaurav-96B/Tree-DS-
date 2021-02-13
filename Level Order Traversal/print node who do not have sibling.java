class Tree
{
    ArrayList<Integer> noSibling(Node node)
    {
        if(node==null)
        {
            return null;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(node);
         ArrayList<Integer>a=new ArrayList<>();
        while(!q.isEmpty())
        {
           int z=q.size();
           while(z>0)
           {
               Node n=q.peek();
               if(n.left==null&&n.right!=null)
               {
                 a.add(n.right.data);
               }
               if(n.left!=null&&n.right==null)
               {
                   a.add(n.left.data);
               }
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
        if(a.size()==0)
        {
          a.add(-1);
        }
        Collections.sort(a);
        return a;
        
    }
}
