package ds_n_algo.datastructure.bst;

/**
 * Created by PouRit on 01-11-2017.
 */
public class BinarySearchTreeProgram1 {
    public static void main(String[] args) {
        Node root_node=new Node(40);
        root_node.insert(20);
        root_node.insert(60);
        root_node.insert(80);
        root_node.insert(100);

        System.out.println("\nInorder");
        root_node.printInorder();
        System.out.println("\nPreorder");
        root_node.printPreorder();
        System.out.println("\nPostorder");
        root_node.printPostorder();
    }
}
