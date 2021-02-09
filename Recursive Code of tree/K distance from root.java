class Tree
{
     void printKdistance(Node root, int k)
     {
         if(root==null)
         {
             return;
         }
         if(k==0)
         {
           System.out.print(root.data+" "); 
         }
         printKdistance(root.left,k-1);
         printKdistance(root.right,k-1);
     }
}
