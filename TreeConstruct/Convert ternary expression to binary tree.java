class GfG
{
   
    public static Node convertExp(String str, int i)
    {
       if(i==str.length())
       {
           return null;
       }
        Node n=new Node(str.charAt(i));
       i++;
       if(i<str.length()&&str.charAt(i)=='?')
       {
           n.left=convertExp(str,i+1);
       }
       if(i<str.length()&&str.charAt(i)==':')
       {
           n.right=convertExp(str,i+1);
       }
       return n;
        
    }
}
