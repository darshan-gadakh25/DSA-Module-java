class Queue{
	int []arr;
	int top;
	int f;
		
	public Queue(int size){
		top= -1;
		arr=new int[size];
		f=0;
	}
		
	.
	void display(){
		for(int i=f;i<=top;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	
	void offer(int data){
		if(arr.length < 1){
			System.out.print("Array is empty");
		}
		if(isFull()){
			System.out.print("Array is already full");
		}
		top++;
		arr[top]=data;
		
	}
	
	void poll(){
		if(top == -1){
			System.out.print("Array is empty");
			return;
		}
		f++;; 
		 
	}
	
	int peek(){
		if(isEmpty()){
			System.out.print("Array is empty");
		}
		return arr[top];
	}
	boolean isEmpty(){
		
		return top == -1;
	}
	
	boolean isFull(){
		return top == arr.length -1;
	}
}
public class QueueOperation{

	
	public static void main(String [] args ){
		Queue st=new Queue(6);
		st.offer(21);
		st.offer(31);
		st.offer(51);
		st.offer(71);
		st.offer(86);
		 
		
		System.out.print("Display array element");
		System.out.println();
		st.display();
		System.out.println();
		
		int val=st.peek();
		System.out.print("Display array element"+val);
		System.out.println();
		st.poll();
		st.display();
	}
}