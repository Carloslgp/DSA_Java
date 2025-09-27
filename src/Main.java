import BinaryTree.BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<Integer>(10);

        tree.insert(8);
        tree.insert(2);
        tree.insert(1);
        tree.insert(3);
        tree.insert(9);
        tree.insert(11);
        tree.insert(12);

        tree.remove(3);


        tree.printTree();


    }
}
