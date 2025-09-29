
public class FoodDelivery{
	Queue head;
	static class Queue{
		private int orderId;
		private String customerName;
		Queue next;
	
		public Queue(int orderId, String customerName){
			this.orderId=orderId;
			this.customerName=customerName;
			next=null;
		}
	}
	
	void addOrder(int id, String name){
		Queue newNode=new Queue(id,name);
		Queue q=head;
		
		if(q == null){
			q=newNode;
		}
		else{
			while(q.next != null){
				q=q.next;
			}
			q.next=newNode;
		}
	}
	
	void orderDelivered(){
		Queue q=head;
		if(head == null){
			return;
		}
		
		if( n!= null){
			n=n.next;
		}	
	}
	
	
	public static void main(String [] args){
		
	}
}