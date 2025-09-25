import java.util.*;

public class Addmiddle{
	
	static Node head; 
	
	static class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data=data;
			this.next=null;
		
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
	
	void addmiddle(int prev, int data){
		Node n=head;
		Node newNode=new Node(data);
		
		if(n == null){
			head=newNode;
		}
		
		for(int i=1;i< prev -1;i++){
			n=n.next;
			newNode.next=n.next;
			n.next=newNode;

		}
	}
	
	void deleteFirst(){
		Node n=head;
		
		if(head != null ){
			head =head.next;
		}
	}
	
	
	void deletemiddle(int data){
		Node n=head;
		
		while(n != null && n.next.data != data){
			
			n = n.next;
		}
		
		n.next=n.next.next; 
	}
	
	void addlement(){
		Node n =head;
		
		if(n == null  ){
			System.out.println("List is empty.");
		}
		
		while( n != null && n.next != null){
			int sum=n.data + n.next.data;
			n.data=sum;
			n=n.next;
		}
		
	}
	public static void main(String [] args){
		Addmiddle lp=new Addmiddle();
		
		lp.head=new Node(10);
		Node second=new Node(20);
		Node third=new Node(30);
		Node foru=new Node(40);
		
		lp.head.next=second;

		second.next=third;
		third.next=foru;
		
		System.out.println("");
		System.out.println("show all  element");
		lp.display();
		
		
		System.out.println("");
		System.out.println(" after adding show all  element");
		lp.addmiddle(3,44);
		lp.display();
		
		System.out.println("");
		System.out.println(" after  shoelting first w all  element");
		lp.deleteFirst();
		lp.display();
		
		System.out.println("");
		System.out.println(" after  delting first w all  element");
		lp.deletemiddle(40);
		lp.display();
		


		System.out.println("");
		System.out.println(" after adding first w all  element");
		lp.addlement();
		lp.display();
		


		

	}
}