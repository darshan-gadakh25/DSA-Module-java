public class DoublyLinkedList1{
	static Node head;
	
	static class Node{
		int data;
		Node prev;
		Node next;
	
		Node(int data){
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
	void display(){
		Node n=head;
		while(n != null){
			System.out.print(n.data+"-------->");
			n=n.next;
		}
	}
	
	void insert(int data){
		
		Node n=head;
		Node newNode= new Node(data);
		newNode.next=head;

		if( n != null){
			head.prev=newNode;
			head=newNode;
		}
	}
	
	void insertAfter(Node prev1, int data){
		Node newNode=new Node(data);
		
		
		if(prev1 == null){
			System.out.println("The List is empty");
		}
		
		newNode.next=prev1.next;
		prev1.next=newNode;
		
		newNode.prev=prev1;
		if(newNode != null){
			newNode.next.prev =newNode;
		}
	}
	void insertLast(int data){
		Node n=head;
		Node newNode=new Node(data);
		if(n == null){
			System.out.println("The List is empty");
			return;
		}
		while (n.next != null) {
			n = n.next;
		}
		n.next = newNode;
	}
	
	void deletionfirst(Node del){
		if(head== null ||  del ==  null){
			return;
		}
		
		if(head == del){
			head=del.next;
		}
		
		if(del.next != null){
			del.next.prev=del.prev;
		}
		if(del.prev != null){
			del.prev.next=del.next;
		}
		return;
	}
	
	public static void main(String [] args){
		DoublyLinkedList1 li=new DoublyLinkedList1();
		
		li.head =new Node(32);
		
		Node second=new Node(45);
		
		Node third=new Node(76);
		
		Node four=new Node(43);
		
		li.head.prev = null;
		li.head.next = second;
		
		second.prev=head;
		second.next=third;
		
		third.prev=second;
		third.next=four;
		
		four.prev=third;
		
		li.display();
		
		System.out.println();
		System.out.println("New Node ");
		li.insert(99);
		li.display();
	
		System.out.println();
		System.out.println("New Node in middle");
		li.insertAfter(second, 87);
		li.display();
		
		System.out.println();
		System.out.println("New Node in Last");
		li.insertLast(55);
		li.display();
		
		System.out.println();
		System.out.println(" Node delete in first");
		li.deletionfirst(li.head.next);
		li.display();
	}
}

