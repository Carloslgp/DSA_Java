package BinaryTree;



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


    public TreeNode<T> search(T data) {

        if(root == null){
            System.out.println("Tree is empty");
            return new TreeNode<T>();
        }

        if(root.getData().compareTo(data) == 0){
            return root;
        }

        return search(new TreeNode<>(data), root);


    }

    public TreeNode<T> search(TreeNode<T> nodeToSearch,  TreeNode<T> tempNode){
        if(tempNode.getRight() == null && tempNode.getLeft() == null && tempNode.getData().compareTo(nodeToSearch.getData()) != 0){
            System.out.println("Not found");
            return null;
        }else{

            //right
            if(tempNode.getData().compareTo(nodeToSearch.getData()) < 0){
                return search(nodeToSearch, tempNode.getRight());


            //left
            }else  if(tempNode.getData().compareTo(nodeToSearch.getData()) > 0){
                return search(nodeToSearch, tempNode.getLeft());
            }else{
                System.out.println("Found: " + tempNode.getData());
                return tempNode;
            }

        }

    }





    public void remove(T data) {
        TreeNode<T> nodeToRemove = search(data);

        if(nodeToRemove == null) {
            System.out.println("Not found");
            return;
        }
        else if(nodeToRemove.getData() == null){
            System.out.println("Tree is empty");
            return;
        }else{
            if(nodeToRemove.getRight() == null && nodeToRemove.getLeft() == null){
                removeNoChild(nodeToRemove);
            }else if(nodeToRemove.getRight() == null || nodeToRemove.getLeft() == null){
                removeOneChild(nodeToRemove);
            }else{
                removeTwoChild(nodeToRemove);
            }
        }






    }

    private void removeNoChild(TreeNode<T> NodeToRemove){
        TreeNode<T> parentNode = findParent(NodeToRemove, root);
        if(parentNode.getRight().equals(NodeToRemove)){
            parentNode.nullRight();
        }
        else if(parentNode.getLeft().equals(NodeToRemove)){
            parentNode.nullLeft();
        }
        NodeToRemove.setData(null);

    }

    private void removeOneChild(TreeNode<T> NodeToRemove){


    }

    private void removeTwoChild(TreeNode<T> NodeToRemove){


    }


    private TreeNode<T> findParent(TreeNode<T> nodeToFind ,TreeNode<T> tempNode){
        if(tempNode.getRight().equals(nodeToFind) || tempNode.getLeft().equals(nodeToFind)){
            return tempNode;
        }else{
            if(tempNode.getData().compareTo(nodeToFind.getData()) < 0){
                return findParent(nodeToFind, tempNode.getRight());
            }else{
                return findParent(nodeToFind, tempNode.getLeft());
            }
        }
    }

    public TreeNode<T> getRoot() {
        return root;
    }


    public void printTree() {
        printTree(root, 0);
    }

    private void printTree(TreeNode<T> node, int level) {
        if (node == null) {
            return;
        }


        printTree(node.getRight(), level + 1);


        for (int i = 0; i < level; i++) {
            System.out.print("    ");
        }
        System.out.println(node.getData());


        printTree(node.getLeft(), level + 1);
    }




}
