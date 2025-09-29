class BinarySearchTree{
	private Node root;
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
	
	public BinarySearchTree(){
		root =null;
	}
	
	public void add(int data){
		Node newNode=new Node(data);
		
		if(root == null){
			root = newNode;
		}
		else{
			Node trav=root;
			while(true){
				if(data <  trav.data){
					if( trav.left != null){
					trav=trav.left;
					}
					else{
						trav.left=newNode;
						break;
					}
				}
				else{
					if( trav.right != null){
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
	
	void displayInorder(Node n){
		if(n == null){
			return;
		}
		displayInorder(n.left);
		System.out.print(n.data+"------>");
		displayInorder(n.right);
	}
	
	void inOrder(){
		displayInorder(root);
	}
	
	void displayPreorder(Node n){
		if(n == null){
			return;
		}
		System.out.print(n.data+"------>");
		displayPreorder(n.left);
		displayPreorder(n.right);
	}
	
	void preOrder(){
		displayPreorder(root);
	}
	
	void displayPostorder(Node n){
		if(n == null){
			return;
		}
		displayPostorder(n.left);
		displayPostorder(n.right);
		System.out.print(n.data+"------>");

	}
	
	void postOrder(){
		displayPostorder(root);
	}
}
public class BinaerySearchTreeMain{
	public static void main(String [] args){
		BinarySearchTree bt=new BinarySearchTree();
		bt.add(50);
		bt.add(30);
		bt.add(20);
		bt.add(70);
		bt.add(90);
		bt.add(80);
		bt.add(60);
		bt.add(10);
		bt.add(40);
		bt.add(100);
		
		System.out.println("In Oder");
		System.out.println();
		bt.inOrder();
		System.out.println();
		System.out.println("Pre Oder");
		System.out.println();
		bt.preOrder();
		System.out.println("Post Oder");
		System.out.println();
		bt.postOrder();
		
	}
}