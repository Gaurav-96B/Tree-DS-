class Pair
{
    Node root;
    int hd;
    Pair(Node root,int hd)
    {
        this.root=root;
        this.hd=hd;
    }
}

class View
{
    static void topView(Node root)
    {
        Queue<Pair>q=new LinkedList<>();
        Map<Integer,Integer>h=new TreeMap<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty())
        {
            int z=q.size();
            while(z>0)
            {
              Pair p=q.poll();
              Node temp=p.root;
              int hd=p.hd;
              if(h.get(hd)==null)
              {
                  h.put(hd,temp.data);
              }
              if(temp.left!=null)
              {
                  q.add(new Pair(temp.left,hd-1));
              }
              if(temp.right!=null)
              {
                  q.add(new Pair(temp.right,hd+1));
              }
              z--;
            }
        }
        for(Map.Entry<Integer,Integer>m:h.entrySet())
        {
            System.out.print(m.getValue()+" ");
        }
        
    }
}
