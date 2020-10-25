class BinaryTree
{
    static int sumBT(Node head){
        if(head==null)
        {
            return 0;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(head);
        int sum=0;
        while(1==1)
        {
            int z=q.size();
            if(z==0)
            {
                return sum;
            }
            while(z>0)
            {
              Node temp=q.peek();
              sum=sum+temp.data;
              q.remove();
              if(temp.left!=null)
              {
                  q.add(temp.left);
              }
              if(temp.right!=null)
              {
                  q.add(temp.right);
              }
              z--;
              
            }
        }
    }
}
