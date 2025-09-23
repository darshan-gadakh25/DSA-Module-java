import java.util.*;

public class LinkListOperationReverse{
	
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
		if(head == null){
			System.out.println("The List is empty");
			return;
		}
		while(n != null){
			System.out.print(n.data+"----->");
			n=n.next;
		}
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
	
	public static void main(String [] args){
		LinkListOperationReverse lp=new LinkListOperationReverse();
		
		lp.head=new Node(10);
		Node second=new Node(20);
		Node third=new Node(30);
		
		lp.head.prev=null;
		lp.head.next=second;
		
		second.prev=head;
		second.next=third;
		
		third.prev=second;
		
		System.out.println("");
		System.out.println("show all  element");
		head =lp.reverse(lp.head);
		lp.display();
		
		
		
		

	}
}