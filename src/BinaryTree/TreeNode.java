package BinaryTree;


public class TreeNode<T>{
    private T data;
    private TreeNode<T> left;
    private TreeNode<T> right;

    public TreeNode(T data){
        this.data = data;
    }

    public TreeNode(){
        data = null;
    }

    public void addLeftNode(T data){
        this.left = new TreeNode<>(data);
    }

    public void addRightNode(T data){
        this.right = new TreeNode<>(data);
    }

    public void nullLeft(){
        this.left = null;
    }

    public void nullRight(){
        this.right = null;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public TreeNode<T> getLeft() {
        return left;
    }

    public TreeNode<T> getRight() {
        return right;
    }

    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    public void setRight(TreeNode<T> right) {
        this.right = right;
    }


}
