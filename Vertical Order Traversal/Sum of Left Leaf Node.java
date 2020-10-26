class Pair
{
    Node node;
    int hd;
    Pair(Node node,int hd)
    {
       this.node=node;
       this.hd=hd;
    }
}
class Solution{

    public int leftLeavesSum(Node root) 
    { 
     Queue<Pair> q=new LinkedList<>();
        Map<Integer,ArrayList<Integer>> m=new TreeMap<>();
        q.add(new Pair(root,0));
        int sum=0;
        while(!q.isEmpty())
        {
            int z=q.size();
            while(z>0)
            {
            Pair p=q.poll();
            int hd=p.hd;
            Node curr=p.node;
            if(hd<0)
            {
                if(curr.left==null&&curr.right==null)
                {
                    sum=sum+curr.data;
                }
            }
            if(curr.left!=null)
            {
                q.add(new Pair(curr.left,hd-1));
            }
            if(curr.right!=null)
            {
                q.add(new Pair(curr.right,0));
            }
            z--;
        }
        }
        return sum;
    } 

}
