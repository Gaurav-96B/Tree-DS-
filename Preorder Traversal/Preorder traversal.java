class BinaryTree
{
   
    static void preorder(Node root)
    {
      
        if(root==null)
        {
            return;
        }
        Stack<Node>s=new Stack<>();
        s.push(root);
        while(s.size()>0)
        {
            Node temp=s.pop();
            System.out.print(temp.data+" ");
            if(temp.right!=null)
            {
                s.push(temp.right);
            }
            if(temp.left!=null)
            {
                s.push(temp.left);
            }
        }  
        
        
        
    }

}
