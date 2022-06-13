public class BinaryTree<E> {
    private BinaryTreeNode root;

    public BinaryTree()
    {
        root = null;
    }

    public boolean isEmpty()
    {
        return root == null;
    }

    public void insert(E data)
    {
        root = insert(root, data);
    }

    private BinaryTreeNode insert(BinaryTreeNode node, E data)
    {
        if (node == null)
            node = new BinaryTreeNode(data);
        else
        {
            if (node.getLeft() == null)
                node.left = insert(node.left, data);
            else
                node.right = insert(node.right, data);
        }
        return node;
    }

    public int countNodes()
    {
        return countNodes(root);
    }

    private int countNodes(BinaryTreeNode r)
    {
        if (r == null)
            return 0;
        else
        {
            int l = 1;
            l += countNodes(r.getLeft());
            l += countNodes(r.getRight());
            return l;
        }
    }

    public boolean search(E val)
    {
        return search(root, val);
    }

    private boolean search(BinaryTreeNode r, E val)
    {
        if (r.getData() == val)
            return true;
        if (r.getLeft() != null)
            if (search(r.getLeft(), val))
                return true;
        if (r.getRight() != null)
            if (search(r.getRight(), val))
                return true;
        return false;
    }

    public void inorder()
    {
        inorder(root);
    }
    private void inorder(BinaryTreeNode r)
    {
        if (r != null)
        {
            inorder(r.getLeft());
            System.out.print(r.getData() +" ");
            inorder(r.getRight());
        }
    }

    public void preorder()
    {
        preorder(root);
    }
    private void preorder(BinaryTreeNode r)
    {
        if (r != null)
        {
            System.out.print(r.getData() +" ");
            preorder(r.getLeft());
            preorder(r.getRight());
        }
    }

    public void postorder()
    {
        postorder(root);
    }
    private void postorder(BinaryTreeNode r)
    {
        if (r != null)
        {
            postorder(r.getLeft());
            postorder(r.getRight());
            System.out.print(r.getData() +" ");
        }
    }
}
