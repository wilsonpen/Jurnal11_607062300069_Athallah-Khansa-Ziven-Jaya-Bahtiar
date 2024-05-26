/* Class BTNode */
class BTNode2<E> {
    private BTNode2<E> left;
    private BTNode2<E> right;
    private E data;

    /* Default Constructor */
    public BTNode2() {
        this.left = null;
        this.right = null;
        this.data = null;
    }

    /* Constructor with data */
    public BTNode2(E item) {
        this.left = null;
        this.right = null;
        this.data = item;
    }

    /* Setters for left and right nodes */
    public void setLeft(BTNode2<E> left) {
        this.left = left;
    }

    public void setRight(BTNode2<E> right) {
        this.right = right;
    }

    /* Getters for left and right nodes */
    public BTNode2<E> getLeft() {
        return left;
    }

    public BTNode2<E> getRight() {
        return right;
    }

    /* Setters and getters for node data */
    public void setData(E data) {
        this.data = data;
    }

    public E getData() {
        return data;
    }
}