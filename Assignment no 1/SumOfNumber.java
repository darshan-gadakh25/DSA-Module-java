import java.util.*;

public class SumOfNumber{
	
	static int sumOf(int n){
	
		if(n == 0){
			return 0;
		}
		else{	
			
			return n + sumOf(n-1);
		}
	}

	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		
		System.out.println("sum of number: "+sumOf(num));

	}
}