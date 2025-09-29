import java.util.*;
public class PreOrderTraversal{
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
	
	public PreOrderTraversal(){
		root=null;
	}
	void preOrder(Node n){

		if(n == null){
			return;
		}
		
		System.out.print(n.data+" ");
		preOrder(n.left);
		preOrder(n.right);
	}
	
	void printPreOrder(){
		preOrder(root);
	}
	public static void main(String [] args){
	
		PreOrderTraversal pt=new PreOrderTraversal();
		pt.root=new Node(1);
		pt.root.left=new Node(2);
		pt.root.right=new Node(3);
		pt.root.left.left=new Node(4);
		pt.root.left.right=new Node(5);
		
		System.out.println("Shoe Pre Order Traversal");
		pt.printPreOrder();
	}
}