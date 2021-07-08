package MATDIS;

/**
 *
 * @author Nila Amalia
 */
public class BST {
    Node root;
    public BST(){
        root = null;
    }
    public BST(Node root){
        this.root = root;   
    }
    public void visit(Node p) {
        System.out.print(p.key  + " ");
    }
    public void preOrder(Node root){
        if(root == null) return;
        visit(root);
        preOrder(root.kiri);
        preOrder(root.kanan);
    }
     public void inOrder(Node root){
        if(root == null) return;
        inOrder(root.kiri);
        visit(root);
        inOrder(root.kanan);
    }
      public void postOrder(Node root){
        if(root == null) return;
        postOrder(root.kiri);
        postOrder(root.kanan);
        visit(root);
    }

}
