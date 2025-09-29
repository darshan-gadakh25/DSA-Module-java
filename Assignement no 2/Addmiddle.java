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
	
	Node SortingList(){
		for(Node i=head;i!=null;i=i.next){
			for(Node j=i.next;j!=null;j=j.next){
				if(i.data > j.data){
					int temp=i.data;
					i.data=j.data;
					j.data=temp;
				}
			}
		}
		return head;
	}
	
	Node reverselist(){
		Node oldhead=head;
		head=null;
	
		while( oldhead!= null){
			Node temp=oldhead;
			oldhead=oldhead.next;
			temp.next=head;
			head=temp;
		}
		return head;
	}
	
	Node reversion(Node n){
		if(n.next == null){
			head=n;
			return n;
		}
		else{
			Node t=reversion(n.next);
			t.next=n;
			n.next=null;
			return n;
		}
	}
	
	private void reverseDisplay(Node n){
		if(n == null)
			return;
		reverseDisplay(n.next);
		System.out.print(n.data+" ");
		
	}
	public  void reverseDisplay(){
		 reverseDisplay(head);
		
	}
	
	public static void main(String [] args){
		Addmiddle lp=new Addmiddle();
		
		lp.head=new Node(80);
		Node second=new Node(20);
		Node third=new Node(90);
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
		System.out.println(" after  delteign   first w all  element");
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
		


		System.out.println("");
		System.out.println(" after reversing   element");
		lp.reverselist();
		lp.display();
		
		System.out.println("");
		System.out.println(" after sorting element");
		lp.SortingList();
		lp.display();
		
		
		System.out.println("");
		System.out.println(" after reverse using recuision element");
		lp.reversion(lp.head);
		lp.display();
		
		System.out.println("");
		System.out.println("Display");
		lp.reverseDisplay(lp.head);
	}
}