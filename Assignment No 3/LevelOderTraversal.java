public class LevelOderTraversal{
	
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
	
	static class Queue{
		Node[] arr; 
		int front, rear, size, capacity; 
		
		Queue(int capacity) { 
			this.capacity = capacity; 
			arr = new Node[capacity]; 
			front = 0; 
			rear = -1; 
			size = 0;
		}
		
		boolean isEmpty() { 
			return size == 0; 
		} 
		
		boolean isFull() { 
			return size == capacity; 
		} 
		
		void enqueue(Node node) { 
			if (isFull()) { 
				System.out.println("Queue is full"); 
				return; 
			} 
			rear = (rear + 1) % capacity; 
			arr[rear] = node; size++; 
		}

		Node dequeue() { 
			if (isEmpty()) { 
				System.out.println("Queue is empty"); 
				return null; 
			} 
			
			Node temp = arr[front]; 
			front = (front + 1) % capacity; 
			size--; 
			return temp; 
		}
	}
	static void levelOrder(Node root) { 
		if (root == null) 
			return; 
		Queue q = new Queue(100); 

		while (!q.isEmpty()) { 
			Node current = q.dequeue(); 
			System.out.print(current.data + " "); 
		
			if (current.left != null) { 
				q.enqueue(current.left); 
			} 
		
			if (current.right != null) {
				q.enqueue(current.right); 
			} 
		}
	 }
	public static void main(String [] args){
	
		Node root = new Node(1); 
		root.left = new Node(2); 
		root.right = new Node(3); 
		root.left.left = new Node(4); 
		root.left.right = new Node(5); 
		root.right.left = new Node(6); 
		root.right.right = new Node(7); 
		
		System.out.println("Level Order Traversal:"); 
		levelOrder(root);
	}
}