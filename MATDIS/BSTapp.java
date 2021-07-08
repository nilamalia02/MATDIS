package MATDIS;

/**
 *
 * @author Nila Amalia
 */
public class BSTapp {
    public static void main(String[] args){
        Node x1= new Node(20);
        Node x2= new Node(16);
        Node x3= new Node(6);
        Node x4= new Node(12);
        Node x5= new Node(2);
        Node x6= new Node(19);
        Node x7= new Node(18);
        
        x1.kiri = x2;
        x1.kanan = x5;
        
        x2.kiri = x3;
        x2.kanan = x4;
        
        x5.kiri = x6;
        x5.kanan = x7;
                
        
        
        BST bst = new BST(x1);
        
        System.out.println("Nama : Nila Amalia");
        System.out.println("NIM  : E41200368");
        System.out.println("GOL  : A");
        System.out.println("--------------------------------");
        bst.preOrder(bst.root);
        System.out.println(" = PreOrder" );
        bst.inOrder(bst.root);
        System.out.println(" = InOrder " );
        bst.postOrder(bst.root);
        System.out.println(" = PostOrder");
    }
}
