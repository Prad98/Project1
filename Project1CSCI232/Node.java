
/**
 * Write a description of class Node here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Node
{
    int root;
    Node left;
    Node right;
    
    public Node(int root)
    {
        this.root = root;
    }
    
    public void insertNode(int input)
    {
        if (input<=root) //checking if user added value is less than the root node
        {
            if(left==null) //if there is no node at left, we assign the user value as the new left nod, left child of the root
            {
                left = new Node(input);
            }
            else   //if there is a node to the left of the root, 
            {
                left.insertNode(input);
            }
        }
        
        if (input>=root) //checking if user input is greater than the root
        {
            if(right==null)  //if there is no node greater than the root to the right of it, we create a new node with user value
            {
                right = new Node(input);
            }
            else  //if there is a node with a greater value than the root and its right nodes, we create another node with the user value
            {
                right.insertNode(input);
            }
        }
    }
    
    //inOrder means we start at the left, then the root and then the right nodes
    public void inOrder()
    {
        if(left!=null) //checking if there are nodes to the left of the root
        {
            left.inOrder();
        }
        System.out.print(root + ","); //printing the root node and since all the other nodes are connected to the root, they get printed as well.
        if(right != null) //checking if there are nodes to the right of the root
        {
            right.inOrder();
        }
    }
    //postOrder means we start at the left, then the right nodes and finally the root node.
    public void postOrder()
    {
        if(left!=null)
        {
            left.postOrder();
        }
        if(right!=null)
        {
            right.postOrder();
        }
        System.out.print(root + ",");
    }
    
    public void preOrder()
    {
        System.out.print(root + ",");
         if(right!=null)
        {
            right.postOrder();
        }
        if(left!=null)
        {
            left.postOrder();
        }
        
    }
}
    
    
    
