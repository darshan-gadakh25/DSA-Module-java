import java.util.*;

public class Fabonacci{
	static int fabonacciSeries(int n){
		
		/* int a=0;
		 int b=1;
		 int c=0;
		 for(int i=1;i<=n; i++){
			 
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		 }
		 */
		 int a=0;
		 int b=1;
		 
		 if( n <= 1){
			 return n;
		 }
		 else{
			return fabonacciSeries(n-1) + fabonacciSeries(n-2);
		 }
		 
	}
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		
		for(int i=0;i<= num;i++){
			System.out.println(fabonacciSeries(i));
		}
	}
}