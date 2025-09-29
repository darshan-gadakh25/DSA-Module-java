import java.util.*;
import java.lang.*;
import java.util.Stack;
public class InfixToPrefix{
	
	static int calclate(int a,int b, char ch){
		switch(ch){
			case '$':
				return (int) Math.pow(a,b);
			
			case '*':
				return a* b;
			
			case '/':
				return a / b;
				
			case '+':
				return a + b;
				
			case '-':
				return a - b;
			
			case '%':
				return a % b;
				
		}
		return 0;
	}
	
	static int convert(String str){
		Stack<Integer> st = new Stack<>();
		for(int i=str.length()-1;i>=0;i--){
			char ch=str.charAt(i);
			
			if(Character.isDigit(ch)){
				String s=Character.toString(ch);
				int n=Integer.parseInt(s);
				st.push(n);
			}
			
			else{
				int a=st.pop();
				int b=st.pop();
				
				int c=calclate(a,b,ch);
				st.push(c);
			}
		}
		return st.pop();
	}
	public static void main(String[] args){
		String str="+-+59*4-8/62$1-73";
		int convert=convert(str);
		System.out.println(convert);
	}
}