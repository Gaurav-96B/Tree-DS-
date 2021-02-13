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
class Tree{
    public ArrayList<Integer> verticalSum(Node root) {
        Queue<Pair> q=new LinkedList<>();
        Map<Integer,ArrayList<Integer>> m=new TreeMap<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty())
        {
            int z=q.size();
            while(z>0)
            {
            Pair p=q.peek();
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
            q.poll();
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
        ArrayList<Integer>a=new ArrayList<>();
        for(Map.Entry<Integer,ArrayList<Integer>> me:m.entrySet())
        {
            int sum=0;
             ArrayList<Integer> al=me.getValue();
             for(int v:al)
             {
                 sum=sum+v;
             }
            a.add(sum);
        }
        return a;
    }
}
