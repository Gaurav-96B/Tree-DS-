class GfG{
    public int minLeafSum(Node root){
        if(root==null)
        {
            return 0;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        int sum=0;
        int count=0;
        while(!q.isEmpty())
        {
            int z=q.size();
            while(z>0)
            {
              Node n=q.peek();
              if(n.left==null&&n.right==null)
              {
                  sum=sum+n.data;
                  count=1;
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
            if(count==1)
            {
                break;
            }
        }
        return sum;
    }
}
