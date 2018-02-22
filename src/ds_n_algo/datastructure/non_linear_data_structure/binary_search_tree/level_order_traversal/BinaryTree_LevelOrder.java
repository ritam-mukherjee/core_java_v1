package ds_n_algo.datastructure.non_linear_data_structure.binary_search_tree.level_order_traversal;

import ds_n_algo.datastructure.linear_data_structure.queues.array_implimentation.Queue_Array;

import java.util.LinkedList;
import java.util.Queue;

/**
Source  :   GeekForGeek
Link    :   https://www.geeksforgeeks.org/level-order-tree-traversal/
 */
class Node {
    /*each node having a data*/
    int data;

    /*also two child nodes*/
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }

    /* Method 1# insert(data) -> insert a value*/
    public void insert(int value) {

        value_less_or_equal_data:
        if (value <= data) {
            if (left == null)
                left = new Node(value);
            else
                left.insert(value);/*recursion: call left nodes insert method*/
        }
        value_greater_data:
        if (value > data) {
            if (right == null)
                right = new Node(value);
            else
                right.insert(value);/*recursion: call right nodes insert method*/
        }
    }
}
public class BinaryTree_LevelOrder {
    Node root;
    public BinaryTree_LevelOrder() {
        root=null;
    }
    /* function to print level order traversal of tree*/
    void printLevelOrder_classical_approach()
    {
        int h = getHeight(root);
        int i;
        for (i=1; i<=h; i++)
            printGivenLevel(root, i);
    }
    /* Compute the "height" of a tree -- the number of
    nodes along the longest path from the root node
    down to the farthest leaf node.*/
    public int getHeight(Node root){
        if(root==null)
            return 0;
        else{
            int lheight=getHeight(root.left);
            int rheight=getHeight(root.right);

            if(lheight>rheight)
                return lheight+1;
            else
                return rheight+1;
        }
    }

    public void printGivenLevel(Node root,int level){
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1)
        {
            printGivenLevel(root.left, level-1);
            printGivenLevel(root.right, level-1);
        }
    }


    void printLevelOrder_queue_approach(){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty())
        {


            /* poll() removes the present head.
            For more information on poll() visit
            http://www.tutorialspoint.com/java/util/linkedlist_poll.htm */
            Node tempNode = queue.poll();
            System.out.print(tempNode.data + " ");

            /*Enqueue left child */
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            /*Enqueue right child */
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }




    /* Driver program to test above functions */
    public static void main(String args[])
    {
        BinaryTree_LevelOrder tree = new BinaryTree_LevelOrder();
        tree.root= new Node(1);
        tree.root.left= new Node(8);
        tree.root.right= new Node(6);
        tree.root.left.left= new Node(4);
        tree.root.left.right= new Node(5);

        System.out.println("Level order traversal of binary tree is ");
        tree.printLevelOrder_classical_approach();
        System.out.println("\n---------------------------");
        tree.printLevelOrder_queue_approach();
    }
}
