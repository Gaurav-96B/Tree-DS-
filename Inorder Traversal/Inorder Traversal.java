class Tree
{
 
    void inOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        Stack<Node>s=new Stack<>();
        while(root!=null)
        {
            s.push(root);
            root=root.left;
        }
        while(s.size()>0)
        {
            Node temp=s.pop();
            System.out.print(temp.data+" ");
            if(temp.right!=null)
            {
                Node temp1=temp.right;
                while(temp1!=null)
                {
                    s.push(temp1);
                    temp1=temp1.left;
                }
            }
        }
        
    }
    
    
}
