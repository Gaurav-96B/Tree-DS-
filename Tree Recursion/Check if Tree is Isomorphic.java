class BinaryTree  
{ 

    boolean isIsomorphic(Node n1, Node n2)  
    { 
        if(n1==null&&n2==null)
        {
            return true;
        }
        if(n1==null||n2==null)
        {
            return false;
        }
        if(n1.data!=n2.data)
        {
            return false;
        }
        return isIsomorphic(n1.left,n2.left)&&isIsomorphic(n1.right,n2.right)
                ||isIsomorphic(n1.left,n2.right)&&isIsomorphic(n1.right,n2.left);
    }
    
}    
