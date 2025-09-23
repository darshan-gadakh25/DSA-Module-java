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
	
	void deletion(){
		Node n = head;
		if( n != null){
			head =head.next;
		}
		else{
			System.out.println("Node is empty");
		}
		
	}
	
	void deletionAfter( int key){
		Node n=head;
		 while (n != null && n.data != key) {
            n = n.next;
        }
        if (n == null) {
            System.out.println("Node not found");
            return;
        }

        if (n.next == null) {
            System.out.println("No node exists after " + key);
            return;
        }
        n.next = n.next.next;
	}
	
	
	void deleteLast(){
		Node n=head;
		
		if(n ==  null){
			System.out.println("List is Empty");
			return;
		}
		
		if(n.next==null){
			n.next=null;
			return;
		}
		
		Node current=head;
		
		while(current.next.next != null){
			current =current.next;
		}
		
		current.next=null;
	}


	public static void main(String [] args){
		LinkedListDemo2 li=new LinkedListDemo2();
		
		li.head =new Node(32);
		
		Node second=new Node(45);
		
		Node third=new Node(76);
		
		Node four=new Node(43);
		
		li.head.next = second;
		second.next=third;
		third.next=four;
		
		li.display();
		
		System.out.println();
		li.insert(43);
		li.display();
		
		li.deletion();
		System.out.println();
		System.out.println("After deleteing first");
		li.display();
		
		System.out.println();
		li.deletionAfter(43);
		System.out.println();
		System.out.println("After deleteing middle");
		li.display();
		
		System.out.println();
		li.deleteLast();
		System.out.println();
		System.out.println("After deleteing Last");
		li.display();
		
	}
}