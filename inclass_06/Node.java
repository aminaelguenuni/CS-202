import java.util.*;
public class Node {
    // data fields
    public int data;
    public Node next;

    // methods
    public Node(int data) {
    this.data = data;
    next = null;
    }

   
    private Node(int data, Node nodeRef) {
    this.data = data;
    next = nodeRef;

    }
   }
   