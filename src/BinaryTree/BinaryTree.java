package BinaryTree;
import javax.swing.*;


public class BinaryTree<T extends Comparable<T>>{
    private TreeNode<T> root;

    public BinaryTree(T data) {
        this.root = new  TreeNode<>(data);
    }

    public void insert(T data) {
        TreeNode<T> nodeToInsert = new TreeNode<>(data);
        if (root == null) {
            root = nodeToInsert;
        }else{
            insert(nodeToInsert, root);
        }
        
    }
    
    public void insert(TreeNode<T> nodeToInsert, TreeNode<T> tempNode){
        if(tempNode.getData().compareTo(nodeToInsert.getData()) == 0){
            System.out.println("Node already exists");
        } else if (tempNode.getData().compareTo(nodeToInsert.getData()) < 0) {
            if(tempNode.getRight() == null){
                tempNode.setRight(nodeToInsert);
            }else{
                insert(nodeToInsert, tempNode.getRight());
            }

        } else if (tempNode.getData().compareTo(nodeToInsert.getData()) > 0) {
            if(tempNode.getLeft() == null){
                tempNode.setLeft(nodeToInsert);
            }else{
                insert(nodeToInsert,  tempNode.getLeft());
            }
        }

    }



    public TreeNode<T> getRoot() {
        return root;
    }




}
