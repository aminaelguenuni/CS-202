import java.util.*;
import java.io.*;

public class inclass10{
    
    public static void main(String[] args) {
        System.out.println("Enter the number of nodes on the BST: ");
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        
        System.out.println("Enter each node's value: ");
        BST tree = new BST();
        
        while(t-- > 0) {
            int data = scan.nextInt();
            tree.insert(data);
        }
        scan.close();
        System.out.print("pre order traverse  ");
        tree.preOrder();
        System.out.print("in order traverse  ");
        tree.inOrder();
        System.out.print("post order traverse  ");
        tree.postOrder();
        System.out.println("The height of the tree  "+tree.height());


    } 
}

class Node { 
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class BST { //BST class 

  Node root = null; 
  
   public void insert(int data)
   {
     root = insert(root,data); //recursive version
   }
  
    public Node insert(Node root, int data) { //insertion 
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
    //Q2 preorder
    public void preOrder(){
        preOrder(root);
    }
    public void preOrder(Node root){
        if (root==null) {
            return;
        }else{
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    // Q3
    public void inOrder(){
        inOrder(root);
    }
    public void inOrder(Node root){
        if (root==null) {
            return;
        }else{
        inOrder(root.left);    
        System.out.print(root.data + " "); 
        inOrder(root.right);
        }
    }

    //Q4
    public void postOrder(){
        postOrder(root);
    }
    public void postOrder(Node root){
        if (root==null) {
            return;
        }else{
            postOrder(root.left);    
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    //Q5 
    public int height(){
        return height(root);
    }
    
    public int height(Node root){
        if (root==null) {
            return 0;  
        }else{
            int left=height(root.left);
            int right=height(root.right);
            if (left>right) {
                return 1+left;
                
            }else {
                return 1+right;
            }
        }
    }
}

