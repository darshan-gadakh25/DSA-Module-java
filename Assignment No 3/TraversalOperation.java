import java.util.*;
public class TraversalOperation{
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
	
	public TraversalOperation(){
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
	
	void inOrder(Node n){

		if(n == null){
			return;
		}
		
		
		inOrder(n.left);
		System.out.print(n.data+" ");
		inOrder(n.right);
	}
	
	void printInOrder(){
		inOrder(root);
	}
	
	void postOrder(Node n){

		if(n == null){
			return;
		}
		
	
		postOrder(n.left);
		postOrder(n.right);
		System.out.print(n.data+" ");
	}
	
	void printPostOrder(){
		postOrder(root);
	}
	public static void main(String [] args){
	
		TraversalOperation pt=new TraversalOperation();
		pt.root=new Node(10);
		pt.root.left=new Node(20);
		pt.root.right=new Node(30);
		pt.root.left.left=new Node(40);
		pt.root.left.right=new Node(50);
		
		System.out.println("Shoe In Order Traversal");
		pt.printInOrder();
		System.out.println();
		
		System.out.println("Shoe Pre Order Traversal");
		pt.printPreOrder();
		System.out.println();
		
		System.out.println("Shoe Post Order Traversal");
		pt.printPostOrder();
		System.out.println();
	}
}

/*
Scanner sc = new Scanner(System.in);
        int choice, key;
        do {
            System.out.println("\n--- Binary Search Tree Menu ---");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Inorder Traversal");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
               
                    break;
                case 2:
                   
                    break;
                case 3:
                   
                    break;
                case 4:
                   
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 5);
		*/