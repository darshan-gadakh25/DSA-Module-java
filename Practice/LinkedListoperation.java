
public class LinkedListoperation{
	static Node head;
	static class Node{
		int data;
		Node next;
	
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	void display(){
		Node n=head;
		while(n != null) {
			System.out.print(n.data+"----->");
			n=n.next;
		}
	}
	
	void insertFirst(int data){
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
	}
	
	void insertInMiddle(Node prev_node,int data){
		if(prev_node == null){
			System.out.println("prev Node cannot be null");
			return;
		}
		Node newNode=new Node(data);
		newNode.next= prev_node.next;
		prev_node.next=newNode;
	}
	
	void appendsop(int data){
		
		Node newNode=new Node(data);
		if(head == null){
			head = new Node(data);
			return;
		}
		
		newNode.next = null;
		Node last = head;
		while(last.next != null){
			last = last.next;
		}
		
		last.next = newNode;
	
	}
	
	public static void main(String [] args){
		LinkedListoperation op=new LinkedListoperation();
		
		op.head=new Node(21);
		
		Node second=new Node(54);
		
		Node third=new Node(65);
		
		op.head.next=second;
		second.next=third;
		
		System.out.println("Show linkedList:");
		op.display();
		
		System.out.println();
		System.out.println();
		op.insertFirst(89);
		System.out.println("Show After insert first linkedList:");
		op.display();
		
		System.out.println();
		System.out.println();
		op.insertInMiddle(second, 34);
		System.out.println("Show After insert middle linkedList:");
		op.display();
		
		System.out.println();
		System.out.println();
		op.appendsop(77);
		System.out.println("Show After insert end linkedList:");
		op.display();
	}
}