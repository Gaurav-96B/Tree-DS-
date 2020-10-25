class GfG
{
    int tilt=0;
    public int tilt(Node root)
    {
    traverse(root);
    return tilt;
    }
    public int traverse(Node root){
    if(root==null)
    {
    return 0;
    }
    int left=traverse(root.left);
    int right=traverse(root.right);
    tilt=tilt+Math.abs(left-right);
    return left+right+root.data;

    }
    }
