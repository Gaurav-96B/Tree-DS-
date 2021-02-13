class GfG
{
      public static boolean symmetric(Node n1,Node n2)
   {
       if(n1==null&&n2==null)
       {
           return true;
       }
       if(n1==null||n2==null)
       {
           return false;
       }
       return (n1.data==n2.data)&&symmetric(n1.left,n2.right)&&symmetric(n1.right,n2.left);
   }
    public static boolean isSymmetric(Node root)
    {
       if(root==null) 
       {
          return true; 
       }
       return symmetric(root.left,root.right);
    }
}
