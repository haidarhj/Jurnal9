public class BinaryTreeNode<E> {
    BinaryTreeNode left, right;
    E data;

    public BinaryTreeNode()
    {
        left = null;
        right = null;
        data = null;
    }

    public BinaryTreeNode(E item)
    {
        left = null;
        right = null;
        data = item;
    }

    public void setLeft(BinaryTreeNode n)
    {
        left = n;
    }

    public void setRight(BinaryTreeNode n)
    {
        right = n;
    }

    public BinaryTreeNode getLeft()
    {
        return left;
    }

    public BinaryTreeNode getRight()
    {
        return right;
    }

    public void setData(E d)
    {
        data = d;
    }

    public E getData()
    {
        return data;
    }
}
