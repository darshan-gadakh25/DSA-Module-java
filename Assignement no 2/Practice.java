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
		Node n=head;
		Node newNode=new Node(data);
		
		if(n.next == null){
			newNode.prev=n;
			n.next=newNode;
		}
	}
	
	void insertMiddle(Node prevNode,int data){
		Node n=head;
		Node newNode=new Node(data);
		
		newNode.next=prevNode.next;
		prevNode.prev=newNode;
		
		if(n != null){
			head.prev=newNode;
			head=newNode;
		}
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
		
		
		
	}
}