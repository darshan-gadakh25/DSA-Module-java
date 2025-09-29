

public class SortedArrayToBST {
	static class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

    Node sortedArrayToBST(int arr[], int start, int end) {
        if (start > end) 
			return null;

        int mid = (start + end) / 2;
        Node node = new Node(arr[mid]);

        node.left = sortedArrayToBST(arr, start, mid - 1);
        node.right = sortedArrayToBST(arr, mid + 1, end);

        return node;
    }

  
    void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        SortedArrayToBST tree = new SortedArrayToBST();
        int arr[] = {1, 2, 3, 4, 5, 6, 7};

        Node root = tree.sortedArrayToBST(arr, 0, arr.length - 1);

        System.out.println("Preorder Traversal of Balanced BST:");
        tree.preorder(root); 
    }
}
