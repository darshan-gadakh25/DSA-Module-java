class Stack{
	static Node head;
		
	static class Node{
		
		int data;
		Node next;
		
		public Node(int  data){
			this.data=data;
			next=null;
		}
	}
	
	void display(){
		Node n=head;
		if(n == null){
			System.out.print("List is empty");
			return;
		}
		
		while( n != null){
			System.out.print(n.data+"--->");
		}
		n=n.next;
	}
	
		/*
	void push(int data){
		
		
	}
	
	void pop(){
		
	}
	
	int peek(){
		
	}
	boolean isEmpty(){
		
	}
	
	boolean isFull(){
		
	}
	*/
}
public class StackopeartionWithlist{
	static Node head;
		
	static class Node{
		
		int data;
		Node next;
		
		public Node(int  data){
			this.data=data;
			next=null;
		}
	}
	
	void display(){
		Node n=head;
		if(n == null){
			System.out.print("List is empty");
			return;
		}
		
		while( n != null){
			System.out.print(n.data+"--->");
			n=n.next;
		}
		
	}
	
	void push(int data){
		Node n=head;
		Node newNode=new Node(data);
		if(n == null){
			System.out.print("List is empty");
			return;
		}
		
		while(n.next!= null){
			n=n.next;
		}
		n.next=newNode;
	}
	
	void pop(){
		Node n=head;
		if(n == null){
			System.out.print("List is empty");
			return;
		}
		Node current=head;
		while(n.next.next!= null){
			n=n.next;
		}
		
		n.next=null;
	}
	
	int peek(){
		Node n=head;
		if(n == null){
			System.out.print("List is empty");
			return -1;
		}
		Node current=head;
		while(n.next!= null){
			n=n.next;
		}
		
		return n.data;
	}
	
	public static void main(String [] args ){
		StackopeartionWithlist st=new StackopeartionWithlist();
		st.head=new Node(21);
		Node second=new Node(43);
		Node third=new Node(53);
		Node four=new Node(48);
		
		st.head.next=second;
		second.next=third;
		third.next=four;
		
		System.out.print("Display List element");
		System.out.println();
		st.display();
		System.out.println();
		
		System.out.print("Display List element after push");
		System.out.println();
		st.push(66);
		st.display();
		System.out.println();
		
		System.out.print("Display List element after pop");
		System.out.println();
		st.pop();
		st.display();
		System.out.println();
		
		System.out.print("Display List element after pop");
		System.out.println(st.peek());
		
		System.out.println();
		
	}
}