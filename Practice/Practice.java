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
	
    void displayReverse(){
        Node n=head;
        while(n.next!= null ){
            n=n.next;
        }
        System.out.println("After reverse:");
        while (n != null) {
            System.out.print(n.data+"---->");
            n=n.prev;
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
		while(n.next != null){
            n=n.next;
           
		}
        n.next=newNode;
        newNode.prev=n;
	}
	 
	void insertMiddle(Node prevNode,int data){
		Node n=head;
		Node newNode=new Node(data);
		
		newNode.next=prevNode.next;
		newNode.prev=prevNode;
		prevNode.next=newNode;
		prevNode.next.prev=newNode;
	}
	
	
	void deletefirst(){
        if(head == null){
            return;
        }

          head=head.next;
            head.prev=null;

    }

    void deleteLast(){
        Node n=head;
        if(n == null){
            return;
        }

          while (n != null) {
            n=n.next;
          }

          n.next= null;


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
		
		// System.out.println();
		// System.out.println("adding first Show data->");
		// p.insert(50);
		// p.display();
		
        System.out.println();
		System.out.println("Priing reverser Show data->");
		p.displayReverse();
         System.out.println();

        System.out.println();
		System.out.println("adding last Show data->");
		p.insertLast(80);
		p.display();
		
       
         System.out.println();
		System.out.println("adding last Show data->");
		p. insertMiddle(sec,60);
		p.display();
		
        
        System.out.println();
		System.out.println("deleting frist Show data->");
		p. deletefirst();
		p.display();

        System.out.println();
		System.out.println("deleting last Show data->");
		p. deleteLast();
		p.display();
        
	}
}