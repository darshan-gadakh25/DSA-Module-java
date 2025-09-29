class Stack{
	int []arr;
	int top;
		
	public Stack(int size){
		top= -1;
		arr=new int[size];
	}
		
	
	void display(){
		for(int i=0;i<=top;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	
	void push(int data){
		if(arr.length < 1){
			System.out.print("Array is empty");
		}
		if(isFull()){
			System.out.print("Array is already full");
		}
		top++;
		arr[top]=data;
		
	}
	
	void pop(){
		if(top == -1){
			System.out.print("Array is empty");
			return;
		}
		top--;
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
public class Stackopeartion{

	
	public static void main(String [] args ){
		Stack st=new Stack(6);
		st.push(21);
		st.push(31);
		st.push(51);
		st.push(71);
		st.push(86);
		 
		
		System.out.print("Display array element");
		System.out.println();
		st.display();
		System.out.println();
		
		int val=st.peek();
		System.out.print("Display array element"+val);
		System.out.println();
		st.pop();
		st.display();
	}
}

class CharStack {
    int top;
    int size;
    char[] arr;

    CharStack(int n) {
        size = n;
        arr = new char[size];
        top = -1;
    }

    void push(char c) {
        if (top < size - 1) {
            arr[++top] = c;
        }
    }

    char pop() {
        if (top >= 0) {
            return arr[top--];
        }
        return '\0';
    }

    boolean isEmpty() {
        return top == -1;
    }
}

public class ReverseStringRecStack {
    static void insertAtBottom(CharStack stack, char c) {
        if (stack.isEmpty()) {
            stack.push(c);
            return;
        }
        char top = stack.pop();
        insertAtBottom(stack, c);
        stack.push(top);
    }

    static void reverseStack(CharStack stack) {
        if (stack.isEmpty()) return;
        char top = stack.pop();
        reverseStack(stack);
        insertAtBottom(stack, top);
    }

    static String reverse(String str) {
        int n = str.length();
        CharStack stack = new CharStack(n);

        for (int i = 0; i < n; i++) {
            stack.push(str.charAt(i));
        }

        reverseStack(stack);

        char[] reversed = new char[n];
        int i = 0;
        while (!stack.isEmpty()) {
            reversed[i++] = stack.pop();
        }

        String result = "";
        for (int j = 0; j < n; j++) {
            result += reversed[j];
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "DSAwithRecStack";
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reverse(str));
    }
}
