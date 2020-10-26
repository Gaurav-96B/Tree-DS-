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
    public void verticalSum(Node root) {
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
        ArrayList<Integer>a=new ArrayList<>();
        Set<Map.Entry<Integer,ArrayList<Integer>>>st=m.entrySet();
        for(Map.Entry<Integer,ArrayList<Integer>> me:st)
        {
            int sum=0;
             ArrayList<Integer> al=me.getValue();
             for(int v:al)
             {
                 sum=sum+v;
             }
            System.out.print(sum+" ");
        }
    }
}
