package MATDIS;

/**
 *
 * @author Nila Amalia
 */
public class Node {
    int key;
    Node kiri;
    Node kanan;
    
    public Node (int key){
        this.key = key;
        kiri = null;
        kanan = null;
    }
}