class BinaryTree2<E> {
    private BTNode2<E> root;

    /* Constructor */
    public BinaryTree2() {
        root = null;
    }

    /* Function to check if the tree is empty */
    public boolean isEmpty() {
        return root == null;
    }

    /* Function to insert data */
    public void insert(E data) {
        root = insert(root, data);
    }

    /* Recursive function to insert data */
    private BTNode2<E> insert(BTNode2<E> node, E data) {
        if (node == null) {
            return new BTNode2<>(data);
        } else {
            if (node.getLeft() == null) {
                node.setLeft(insert(node.getLeft(), data));
            } else {
                node.setRight(insert(node.getRight(), data));
            }
            return node;
        }
    }

    /* Function to count the number of nodes */
    public int countNodes() {
        return countNodes(root);
    }

    /* Recursive function to count the number of nodes */
    private int countNodes(BTNode2<E> node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + countNodes(node.getLeft()) + countNodes(node.getRight());
        }
    }

    /* Function to search for an element */
    public boolean search(E val) {
        return search(root, val);
    }

    /* Recursive function to search for an element */
    private boolean search(BTNode2<E> node, E val) {
        if (node == null) {
            return false;
        }
        if (node.getData().equals(val)) {
            return true;
        }
        return search(node.getLeft(), val) || search(node.getRight(), val);
    }

    /* Function for inorder traversal */
    public void inorder() {
        inorder(root);
    }

    private void inorder(BTNode2<E> node) {
        if (node != null) {
            inorder(node.getLeft());
            System.out.print(node.getData() + " ");
            inorder(node.getRight());
        }
    }

    /* Function for preorder traversal */
    public void preorder() {
        preorder(root);
    }

    private void preorder(BTNode2<E> node) {
        if (node != null) {
            System.out.print(node.getData() + " ");
            preorder(node.getLeft());
            preorder(node.getRight());
        }
    }

    /* Function for postorder traversal */
    public void postorder() {
        postorder(root);
    }

    private void postorder(BTNode2<E> node) {
        if (node != null) {
            postorder(node.getLeft());
            postorder(node.getRight());
            System.out.print(node.getData() + " ");
        }
    }
}