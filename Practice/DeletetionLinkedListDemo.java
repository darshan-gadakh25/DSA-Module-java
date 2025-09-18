public class DeletetionLinkedListDemo{
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
				System.out.println(n.data);
				n=n.next;
			}
		}
		
		void deletetion(int key){
			Node temp=head, prev=null;
			
			if(temp != null &&  temp.data ==key){
				head=temp.next;
				return;
			}
			while(temp != null && temp.data != key){
				prev=temp;
				temp=temp.next;
			}
			if (temp==null) return;
			//System.out.println("element not found");
			prev.next =temp.next;
		}
	


	public static void main(String [] args){
		DeletetionLinkedListDemo li=new DeletetionLinkedListDemo();
		
		li.head =new Node(32);
		
		Node second=new Node(45);
		
		Node third=new Node(76);
		
		Node fourth= new Node(96);
		
		Node five=new Node(87);
		
		li.head.next = second;
		second.next=third;
		third.next=fourth;
		fourth.next=five;
		
		System.out.println();
		li.deletetion(6);
		
		System.out.println("After dletion:");
		li.display();
		
	}
}