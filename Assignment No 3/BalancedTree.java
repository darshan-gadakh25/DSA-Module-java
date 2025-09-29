public class BalancedTree{
	Node root;
	static class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data){
			this.data=data;
			left=null;
			right=null;
		}
	}

	int check(Node node) {
		if (node == null) 
			return 0;

		int leftHeight = check(node.left);
	
		if (leftHeight == -1) 
			return -1;

		int rightHeight = check(node.right);
	
		if (rightHeight == -1)
			return -1;

		int diff;
	
		if (leftHeight > rightHeight)
		
			diff = leftHeight - rightHeight;
		else
			diff = rightHeight - leftHeight;

		if (diff > 1) 
			return -1;
		
		if (leftHeight > rightHeight)
            return leftHeight + 1;
		
        else
            return rightHeight + 1;

	}
	
	boolean isBalanced(Node root){
		return check(root) != -1;
	}
	
	public static void main(String [] args){
	
	BalancedTree tree = new BalancedTree();

    
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
		
	BalancedTree skewed = new BalancedTree();
        skewed.root = new Node(1);
        skewed.root.right = new Node(2);
        skewed.root.right.right = new Node(3);
        skewed.root.right.right.right = new Node(4);

		System.out.println("Check tree balauced is balanced:"); 
		System.out.println(); 
		System.out.println(tree.isBalanced(tree.root));
		
		System.out.println("Check tree skewed is balanced:"); 
		System.out.println(); 
		System.out.println(skewed.isBalanced(skewed.root));
		
	}
}