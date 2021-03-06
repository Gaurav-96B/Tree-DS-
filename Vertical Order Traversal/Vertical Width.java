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
// Function should return vertical width of the binary tree.
class Tree
{
    public static int verticalWidth(Node root)
	{
	    if(root==null)
	    {
	        return 0;
	    }
	    Queue<Pair> q=new LinkedList<>();
        Map<Integer,ArrayList<Integer>> m=new TreeMap<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty())
        {
            int z=q.size();
            while(z>0)
            {
            Pair p=q.poll();
            int hd=p.hd;
            Node curr=p.node;
            if(m.containsKey(hd))
            {
            m.get(hd).add(curr.data);
            }
            else
            {
                ArrayList<Integer> al=new ArrayList<>();
                al.add(curr.data);
                m.put(hd,al);
            }
            if(curr.left!=null)
            {
                q.add(new Pair(curr.left,hd-1));
            }
            if(curr.right!=null)
            {
                q.add(new Pair(curr.right,hd+1));
            }
            z--;
        }
        }
    return m.size();
	}
}
