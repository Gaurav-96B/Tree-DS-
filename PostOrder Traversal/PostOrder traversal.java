class Tree
{
    void postOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        Stack<Node>s=new Stack<>();
        s.push(root);
        Stack<Node>s1=new Stack<>();
        while(s.size()>0)
        {
            Node temp=s.pop();
            s1.push(temp);
            if(temp.left!=null)
            {
               s.push(temp.left);
            }
            if(temp.right!=null)
            {
                s.push(temp.right);
            }
        }
        while(s1.size()>0)
        {
           Node temp1=s1.pop();
           System.out.print(temp1.data+" ");
        }
    }
}
