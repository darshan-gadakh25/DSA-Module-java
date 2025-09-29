
public class InsertNodeAndGetInorder{
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
	
	public void insert(int val){
		Node newNode=new Node(val);
		if(root == null){
			root=newNode;
		}
		
		else{
			Node trav=root;
			while(true){
				if(val < trav.data){
					if(trav.left != null){
						trav=trav.left;
					}
					else{
						trav.left=newNode;
						break;
					}
				}
				else{
					if(trav.right != null){
						trav=trav.right;
					}
					else{
						trav.right=newNode;
						break;
					}
				}
			}
		}
	}
	
	int findMin(){
		Node n=root;
		if( n== null){
			return -1;
		}
		while(n.left != null){
			n=n.left;
		}
		
		return n.data;
	}
	
	int findMax(){
		Node n=root;
		if( n== null){
			return -1;
		}
		while(n.right != null){
			n=n.right;
		}
		
		return n.data;
	}
	
	boolean serach(Node root,int value){
		 if (root == null)
            return false;
		if(root.data == value )
			return true;
		else if(root.data > value){
			return serach(root.left, value);
		}
		else{
			return serach(root.right, value);
		}
	}
	
	public void find(int value){
		if(serach(root,value)){
			System.out.println("Found");
		}
		else{
			System.out.println("Not Found");
		}
	}
	
	
	public void inOrder(Node n){
		if(n == null){
			return;
		}
		else{
			
			inOrder(n.left);
			System.out.print(n.data+" ");
			inOrder(n.right);
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
	
	 Node sortedArrayToBST(int arr[], int start, int end) {
        if (start > end) 
			return null;

        int mid = (start + end) / 2;
        Node node = new Node(arr[mid]);

        node.left = sortedArrayToBST(arr, start, mid - 1);
        node.right = sortedArrayToBST(arr, mid + 1, end);

        return node;
    }
	
	public void preOrder(Node n){
		if(n == null){
			return;
		}
		else{
			System.out.print(n.data+" ");
			preOrder(n.left);
			preOrder(n.right);
		}
	}
	public static void main(String [] args){
	
	InsertNodeAndGetInorder in=new InsertNodeAndGetInorder();
		in.insert(1);
		in.insert(2);
		in.insert(3);
		in.insert(4);
		in.insert(5);
		in.insert(6);
		in.insert(7);
		
		
		
		System.out.println("in Order Traversal:"); 
		in.inOrder(in.root);
		System.out.println(); 

		
		System.out.println("search elemnt is present in Tree:"); 
		System.out.println(); 
		in.find(70);
		
		System.out.println("Minimum element in Tree:"); 
		System.out.println(); 
		System.out.println(in.findMin());
		
		System.out.println("Maximum element in Tree:"); 
		System.out.println(); 
		System.out.println(in.findMax());
		
		
		System.out.println("Check tree i is balanced:"); 
		System.out.println(); 
		System.out.println(in.isBalanced(in.root));
		
		System.out.println("pre Order Traversal:"); 
		in.preOrder(in.root);
		System.out.println(); 

		
	}
}