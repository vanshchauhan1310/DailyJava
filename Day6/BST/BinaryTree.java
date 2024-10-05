
    package Day6.BST;

public class BinaryTree {
    Node root; // Changed from static to instance variable
    
    BinaryTree() {
        this.root = null;
    }
    
    static class Node {
        int data;
        Node left, right;
        
        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }
    
    public void insert(int data) {
        root = insertData(root, data);
    }
    
    public Node insertData(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        }
        else if (data < root.data) {
            root.left = insertData(root.left, data);
        }
        else if (data > root.data) { // Changed from >= to > to avoid duplicates
            root.right = insertData(root.right, data);
        }
        return root;
    }



    public void display() {
        System.out.println("Inorder traversal:");
        inorderTraversal(root);
        System.out.println();
    }

    public void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }


    
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(5);
        tree.insert(8);


       tree.display();
    }
}