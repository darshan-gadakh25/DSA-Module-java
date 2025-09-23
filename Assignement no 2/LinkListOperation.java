import java.util.*;

public class LinkListOperation{
	
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
	
	void insertFirst(int data){
		Node newNode=new Node(data);
		if( head==null){
			System.out.println("The List is empty");
			return;
		}
			newNode.next=head;
			head=newNode;
	}
	
	void insertMiddle(Node prevNode, int key){
		Node newNode=new Node(key);
		Node n=head;
		if( n==null){
			System.out.println("The List is empty");
			return;
		}
		newNode.next=prevNode.next;
		prevNode.next=newNode;
	}
	
	
	void deleteFirst(){
		Node n=head;
		if( head==null){
			System.out.println("The List is empty");
			return;
		}
		if(n != null){
			head=head.next;
		}
		
	}
	
	void deleteLast(){
		Node n=head;
		if( head==null){
			System.out.println("The List is empty");
			return;
		}
		while(n.next.next != null){
			n=n.next;
		}
		n.next=null;
		
	}

	void deleteInMiddle(int key){
		Node n=head;
		if( head==null){
			System.out.println("The List is empty");
			return;
		}
		while (n.next != null && n.next.data != key) {
			n = n.next;
		}
		
		n.next=n.next.next;
	}
	
	int searchElement(int key){
		Node n=head;
		int i=0;
		boolean isfound=false;
		while(n !=null ){
			if(n.data == key){
				isfound=true;
				break;
			}
			i++;
			n=n.next;			
		}
		
		if(isfound){
			return i;	
		}
		else{
			return -1;
		}
		
	}
	
	int counterElement(){
		Node n=head;
		int i=0;
		boolean isfound=false;
		while(n !=null ){
			i++;
			n=n.next;			
		}
		return i;
	}
	
	public static void main(String [] args){
		LinkListOperation lp=new LinkListOperation();
		
		lp.head=new Node(10);
		Node second=new Node(20);
		Node third=new Node(30);
		
		lp.head.next=second;
		second.next=third;
		
		System.out.println("");
		System.out.println("show all  element");
		lp.display();
		
		System.out.println("");
		System.out.println("show element after insert first:");
		lp.insertFirst(5);
		lp.display();
		
		System.out.println("");
		System.out.println("show element after insert in middle:");
		lp.insertMiddle(lp.head.next,25);
		lp.display();
		
			
		System.out.println("");
		System.out.println("show element delete from first:");
		lp.deleteFirst();
		lp.display();
		
		System.out.println("");
		System.out.println("show element delete from LAst:");
		lp.deleteLast();
		lp.display();
		
		System.out.println("");
		System.out.println("show element delete from middle:");
		lp.deleteInMiddle(25);
		lp.display();
		
		System.out.println();
		System.out.println("The element found at index: ");
		int index=lp.searchElement(10);
		System.out.println(index);
		
		
		System.out.println();
		System.out.println("Total element in LinkedList: ");
		int count=lp.counterElement();
		System.out.println(count);
		

	}
}