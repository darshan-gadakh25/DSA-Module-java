public class LinkedListDemo3{
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
		
	int counter(){
		Node n=head;
		int count=0;
		while(n != null){
			count++;
			n=n.next;
		}
		return count;
			
	}
	
	int getCounter(Node n){
		
		if(n == null){
			return 0;
		}
		else {
			return 1 + getCounter(n.next);
		}
	}
	
	boolean search(int key){
		Node n= head;
		
		if( n == null){
			return false;
		}
		
		while( n != null){
			if( n.data == key){
				return true;
			}
			n=n.next;
		}
		return false;
	}
	
	Node reverse(Node n){
		Node prev=null;
		Node curr=n;
		Node next=null;
		
		while(curr != null){
			next = curr.next;
			curr.next=prev;
			prev = curr;
			curr = next;
		}
		
		n=prev;
		return n;
	}

	Node middle(){
		Node f1=head, s1=head;
		
		while(f1 != null && f1.next != null){
			s1 =s1.next;
			f1=f1.next.next;
		}
		
		return s1;
		
		
	}
	
	public static void main(String [] args){
		LinkedListDemo3 li=new LinkedListDemo3();
		
		li.head =new Node(32);
		
		Node second=new Node(45);
		
		Node third=new Node(76);
		
		Node four=new Node(43);
		
		li.head.next = second;
		second.next=third;
		third.next=four;
		
		li.display();
		
		System.out.println();
		System.out.println("No of node: "+li.counter());
		
		System.out.println();
		System.out.println("No of node in recuirsion: "+li.getCounter(li.head));
		
		System.out.println();
		System.out.println("The given node present in list: "+li.search(76));
		
		System.out.println();
		System.out.println("Reverse List: ");
		head = li.reverse(li.head);
		li.display();
		
		System.out.println();
		Node mid=li.middle();
		System.out.println("Middle Node: "+mid.data);
				
		
		
	}
}

