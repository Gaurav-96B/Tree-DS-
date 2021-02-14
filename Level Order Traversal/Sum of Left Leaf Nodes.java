class Solution
{
    public int leftLeavesSum(Node root) 
    { 
        if(root==null)
        {
            return 0;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        int sum=0;
        while(!q.isEmpty())
        {
          int z=q.size();
          while(z>0)
          {
             Node n=q.peek();
             if(n.left!=null)
             {
                 if(n.left.left==null&&n.left.right==null)
                 {
                    sum=sum+n.left.data;
                 }
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
        return sum;
    } 

}
