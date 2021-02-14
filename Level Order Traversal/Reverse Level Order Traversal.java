class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
            if(node==null)
            {
                return null;
            }
           Queue<Node>q=new LinkedList<>();
           q.add(node);
           Stack<Integer>s=new Stack<>();
           ArrayList<Integer>a=new ArrayList<>();
           while(!q.isEmpty())
           {
               int z=q.size();
               while(z>0)
               {
                 Node temp=q.peek();
                 s.push(temp.data);
                 q.poll();
                 if(temp.right!=null)
                 {
                     q.add(temp.right);
                 }
                 if(temp.left!=null)
                 {
                     q.add(temp.left);
                 }
                 z--;
               }
           }
           while(!s.isEmpty())
           {
              a.add(s.pop());
           } 
        return a;
    }
}      
