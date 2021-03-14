
/**
 * Main Class
 *
 * Pradipta Dasgupta 
 * 
 */
public class Test
{
   public static void main(String[] args)
   {
       Node node = new Node(5);
       
       node.insertNode(6);
       node.insertNode(7);
       node.insertNode(8);
       node.insertNode(4);
       System.out.print("Here is the tree in inOrder:" + " ");
       node.inOrder();
       System.out.print('\n' + "Post order:" + " " );
       node.postOrder();
       
       
       
}
}
