public class LinkedListDemo2{
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
		while(n != null){
			System.out.print(n.data+"-------->");
			n=n.next;
		}
	}
		
		
	void insert(int new_data){
		Node new_Node=new Node(new_data);	
		new_Node.next=head;
		head=new_Node;
		
	}
	


	public static void main(String [] args){
		LinkedListDemo2 li=new LinkedListDemo2();
		
		li.head =new Node(32);
		
		Node second=new Node(45);
		
		Node third=new Node(76);
		
		li.head.next = second;
		second.next=third;
		
		li.display();
		
		System.out.println();
		li.insert(43);
		li.display();
		
	}
}