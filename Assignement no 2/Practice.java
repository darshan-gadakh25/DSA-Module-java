public class Practice{
	static Node head; 
	
	static class Node{
		int data;
		Node next;
		Node prev;
		
		public Node(int data){
			this.data=data;
			this.next=null;
			this.prev=null;
		}
		
	}
	
	void display(){
		Node n=head;
		while(n != null){
			System.out.print(n.data+"----------->");
			n=n.next;
		}
		
		
	}
	
	
	void insert(int data){
		Node n=head;
		Node newNode=new Node(data);
		newNode.next=head;
		if(n != null){
			head.prev=newNode;
			head=newNode;
		}
	}
	
	void insertLast(int data){
		Node newNode=new Node(data);
		if(head ==null){
			  head = newNode;
			return;
		}
		
		Node n=head;
		while(n.next != null){
			n=n.next;
		}
		n.next=newNode;
		newNode.prev=n;
	}
	
	void insertMiddle(Node prevNode,int data){
		Node n=head;
		Node newNode=new Node(data);
		
		if(head ==null){
			System.out.println("Empty list");
			return;
		}
		
		if (prevNode == null) {
			System.out.println("The given previous node cannot be null");
			return;
		}

		newNode.next=prevNode.next;
		prevNode.next=newNode;
		newNode.prev=prevNode;
	
		if (newNode.next != null) {
        newNode.next.prev = newNode;
		}
	}
	
	void deleteFirst(){
		if(head == null){
			return;
		}
		if(head.next == null){
			head=null;
		}
		
		head=head.next;
		head.prev=null;
	}
	
	void dletingLast(){
		Node n=head;
		
		if(n == null){
			return;
		}
		
		while(n!=null){
			n= n.next;
		}
		
		 n.next=null;
	}

	
	public static void main(String [] args )
	{
		Practice p=new Practice();
		
		p.head=new Node(10);
		Node sec=new Node(20);
		Node third=new Node(30);
		Node four=new Node(40);
		
		p.head.next=sec;
		sec.next=third;
		sec.prev=head;
		
		third.next=four;
		third.prev=sec;
		four.prev=third;
		
		
		System.out.println();
		System.out.println("Show data->");
		p.display();
		
		System.out.println();
		System.out.println("adding first Show data->");
		p.insert(50);
		p.display();
		
		System.out.println();
		System.out.println("adding Ladst Show data->");
		p.insertLast(70);
		p.display();
		
		System.out.println();
		System.out.println("adding middle Show data->");
		p.insertMiddle(p.head.next, 60);
		p.display();
		

		System.out.println();
		System.out.println("deleting first Show data->");
		p.deleteFirst();
		p.display();
		
		
		System.out.println();
		System.out.println("deleting LAst Show data->");
		p.dletingLast();
		p.display();
	}
}