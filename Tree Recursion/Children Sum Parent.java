class Tree
{
    public static int isSumProperty(Node root)
    {
        int left=0;
        int right=0;
        if(root==null||(root.left==null&&root.right==null))
        {
            return 1;
        }
        else
        {
           if(root.left!=null) 
           {
             left=root.left.data;  
           }
           if(root.right!=null)
           {
               right=root.right.data;
           }
           if((root.data==left+right)&&(isSumProperty(root.left)==1)&&(isSumProperty(root.right)==1))
           {
               return 1;
           }
           else
           {
               return 0;
           }
        }
    }
}
