class GfG {
    public int maxLevelSum(Node root) {
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        int max1=Integer.MIN_VALUE;
        int sum=0;
        while(!q.isEmpty())
        {
            int z=q.size();
            while(z>0)
            {
                Node temp=q.remove();
                sum=sum+temp.data;
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
            max1=Math.max(max1,sum);
            sum=0;
        }
        return max1;
    }
}
