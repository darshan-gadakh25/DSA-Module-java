
class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BST {
    Node root;

    Node delete(Node root, int key) {
        if (root == null) return root;
        if (key < root.key) {
            root.left = delete(root.left, key);
        } else if (key > root.key) {
            root.right = delete(root.right, key);
        } else {
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;
            root.key = minValue(root.right);
            root.right = delete(root.right, root.key);
        }
        return root;
    }

    int minValue(Node root) {
        int minVal = root.key;
        while (root.left != null) {
            minVal = root.left.key;
            root = root.left;
        }
        return minVal;
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }
}

public class Binaryserachdeletion {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.root = new Node(50);
        tree.root.left = new Node(30);
        tree.root.right = new Node(70);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(40);
        tree.root.right.left = new Node(60);
        tree.root.right.right = new Node(80);

        System.out.println("Inorder before deletion:");
        tree.inorder(tree.root);

        tree.root = tree.delete(tree.root, 50);

        System.out.println("\nInorder after deleting 50:");
        tree.inorder(tree.root);
    }
}