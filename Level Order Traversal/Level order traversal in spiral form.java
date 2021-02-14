class Spiral
{
      ArrayList<Integer> findSpiral(Node node) 
      {
           if (node == null) 
           {
            return null;
           }
        Stack<Node> s1 = new Stack<>();  
        Stack<Node> s2 = new Stack<>();  
        s1.push(node);
        ArrayList<Integer>a=new ArrayList<>();
        while (!s1.isEmpty() || !s2.isEmpty()) 
        { 
            while (!s1.isEmpty()) 
            { 
                Node temp = s1.peek(); 
                a.add(temp.data);
                s1.pop(); 
                if (temp.right != null) 
                {
                    s2.push(temp.right); 
                }
  
                if (temp.left != null) 
                {
                    s2.push(temp.left); 
                }
            } 
            while (!s2.isEmpty()) 
            { 
                Node temp = s2.peek(); 
                a.add(temp.data);
                s2.pop();

                if (temp.left != null) 
                {
                    s1.push(temp.left);
                }
                if (temp.right != null) 
                {
                    s1.push(temp.right);
                }
            } 
        }
            return a;
      }
}
