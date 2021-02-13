class Solution
{
    public static ArrayList<Integer> largestValues(Node root)
    {
        if(root==null)
        {
            return null;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        ArrayList<Integer>a=new ArrayList<>();
        while(!q.isEmpty())
        {
            int max=Integer.MIN_VALUE;
            int z=q.size();
            while(z>0)
            {
                Node n=q.peek();
                max=Math.max(max,n.data);
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
            a.add(max);
        }
        return a;
    }
}
