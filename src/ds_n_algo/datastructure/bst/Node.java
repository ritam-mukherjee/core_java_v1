package ds_n_algo.datastructure.bst;

/**
 * Created by PouRit on 01-11-2017.
 */
public class Node {
    int data;

    Node  left;
    Node right;

    public Node(int data) {
        this.data = data;
    }

    public void insert(int value){

        PositionCheck:
        if(value<=data){
            if(left==null)
                left=new Node(value);
            else left.insert(value);
       }else{
            if(right==null)
                right=new Node(value);
            else right.insert(value);
        }
    }

    public void printInorder(){
        left:
        if(left!=null)
            left.printInorder();
        root:
            System.out.print(data+",");
        right:
        if(right!=null)
            right.printInorder();
    }
    public void printPreorder(){
        root:
            System.out.print(data + ",");
        left:
        if(left!=null)
            left.printPreorder();
        right:
        if(right!=null)
            right.printPreorder();
    }

    public void printPostorder(){
        right:
        if(right!=null)
            right.printPreorder();
        left:
        if(left!=null)
            left.printPreorder();
        root:
            System.out.print(data + ",");
    }
}
