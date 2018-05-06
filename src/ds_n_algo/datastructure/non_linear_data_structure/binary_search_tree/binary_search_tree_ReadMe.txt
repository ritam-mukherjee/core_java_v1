



Building Block if a Tree is Node:


===========================================================================================================
										NODE [ GENERIC COMPLEX FORM]
============================================================================================================
/*All tree a private class 'Node' which specify building block of a TREE*/
 class Node<X extends Comparable<X>>{

    /*It represents the value of node,which instantiate at the time of node creation*/
    private X item;
    /*All node having two child node LEFT & RIGHT*/
    private Node left;
    private Node right;

    /*Node also have a reference of PARENT node*/
    private Node parent;

    /*Constructor:
        1.Use to specify item/data at the time of creation
        2.Also use initialize all pointer's*/
    public Node(X item) {
        this.item = item;
        this.left=null;
        this.right=null;
        this.parent=null;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public X getItem() {
        return item;
    }

    public void setItem(X item) {
        this.item = item;
    }


}


=================================================================================================
											NODE [SIMPLEST FORMAT]
=================================================================================================

class Node
{
    int data;
    Node left, right;

    public Node(int data)
    {
        this.data = data;
        left = right = null;
    }
}
=====================================================================================================
                            HEIGHT of a Tree
-----------------------------------------------------------------------------------------------------

  Compute the "height" of a tree -- the number of  nodes along the longest path from the root node
    down to the farthest leaf node.


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
---------------------------------------------------------------------------------------------------------




------------------------------------------------------------------------------------------------
										LEVEL ORDER TRAVERSAL
-----------------------------------------------------------------------------------------------
METHOD 1 (Use function to print a given level)

Algorithm:
There are basically two functions in this method. 
		1. printGivenLevel	:	First One is to print all nodes at a given level; 
		2. printLevelorder	:	The other is to print level order traversal of the tree . 
					printLevelorder makes use of printGivenLevel to print nodes at all levels one by one starting from root.

Another utility function is needed to determine height of the tree;
		3. height(root)		:  this method is used by printlevelorder() to determine how many levels it has to print

					/*Function to print level order traversal of tree*/
					printLevelorder(tree)
						for d = 1 to height(tree)
						   printGivenLevel(tree, d);

					/*Function to print all nodes at a given level*/
					printGivenLevel(tree, level)
						if tree is NULL then return;
						if level is 1, then
						    print(tree->data);
						else if level greater than 1, then
						    printGivenLevel(tree->left, level-1);
						    printGivenLevel(tree->right, level-1);

					/*Function(utility) to print all nodes at a given level*/    	
					height(tree)
						if root is NULL then return;
						if root has left or right child increase height by 1
						whichever bigger among left and right height return that


Time Complexity: O(n^2) in worst case. For a skewed tree, printGivenLevel() takes O(n) time where n is the number of nodes in the skewed tree.
 So time complexity of printLevelOrder() is O(n) + O(n-1) + O(n-2) + .. + O(1) which is O(n^2).




METHOD 2 (Use Queue)

Algorithm:
For each node, first the node is visited and then it’s child nodes are put in a FIFO queue.

printLevelorder(tree)
		1) Create an empty queue q
		2) temp_node = root /*start from root*/
		3) Loop while temp_node is not NULL
		    a) print temp_node->data.
		    b) Enqueue temp_node’s children (first left then right children) to q
		    c) Dequeue a node from q and assign it’s value to temp_node

Time Complexity: O(n) where n is number of nodes in the binary tree



-------------------------------------------------------------------------------------------------------------------
							VERTICAL ORDER TRAVERSAL
--------------------------------------------------------------------------------------------------------------------
 The efficient solution based on hash map is discussed. 

 HD[Horizontal Distance ]
	 1. We need to check the Horizontal Distances from root for all nodes. 
	 2. If two nodes have the same Horizontal Distance (HD), then they are on same vertical line. 
	 HD for root is 0, a right edge (edge connecting to right subtree) is considered as +1 horizontal distance and a left edge is considered as -1 horizontal distance. 
	
We can do preorder traversal of the given Binary Tree. While traversing the tree, we can recursively calculate HDs. 
We initially pass the horizontal distance as 0 for root. 
			For left subtree, we pass the Horizontal Distance as Horizontal distance of root minus 1. 
			For right subtree, we pass the Horizontal Distance as Horizontal Distance of root plus 1. 
			For every HD value, we maintain a list of nodes in a hasp map. Whenever we see a node in traversal, 
we go to the hash map/ tree map entry and add the node to the hash map using HD;
key 	:	HD as a key in map.
value 	:	A vector or List which contains all nodes having same HD value.

The Ideology is All nodes having same HD value consider as they falls in same vertical line.

