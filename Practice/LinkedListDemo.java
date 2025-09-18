public class LinkedListDemo{
	Node head;
	
	static class Node{
		int data;
		Node next;
	
		Node(int data){
			this.data=data;
			this.next=null;
		}
		
		void display(){
			Node n=head;
			while(n != null){
				System.out.println(n.data);
				n=n.next;
			}
		}
	}


	public static void main(String [] args){
		LinkedListDemo li=new LinkedListDemo();
		
		li.head =new Node(32);
		
		Node.second=new Node(45);
		
		Node.third=new Node(76);
		
		li.head =
		
	}
}