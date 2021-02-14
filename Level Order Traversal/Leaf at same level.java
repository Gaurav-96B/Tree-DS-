class GfG
{
    boolean check(Node root)
    {
	if(root==null)
	{
	return true;
	}
    Queue<Node> q=new LinkedList<>();
    q.add(root);
    Map<Integer,Integer> hm=new HashMap<>();
    int level=0;
    while(!q.isEmpty())
    {
    int z=q.size();
    while(z>0)
    {
    Node curr=q.peek();
    if(curr.left==null&&curr.right==null)
    {
    hm.put(level,curr.data);
    }
    q.poll();
    if(curr.left!=null)
    {
    q.add(curr.left);
    }
    if(curr.right!=null)
    {
    q.add(curr.right);
    }
    z--;
    }
    level++;
    
    }
    if(hm.size()==1)
    {
        return true;
    }
    else
    {
        return false;
    }
    }
}
