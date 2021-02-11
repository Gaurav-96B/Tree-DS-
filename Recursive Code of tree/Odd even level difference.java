class Tree
{
	int getLevelDiff(Node node)
	{
	   if (node == null) 
            return 0; 
        return node.data-getLevelDiff(node.left)-getLevelDiff(node.right); 
	}
}
