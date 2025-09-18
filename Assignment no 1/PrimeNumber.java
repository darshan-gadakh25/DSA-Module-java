import java.util.*;

public class PrimeNumber{
	static boolean primeNumber(int n, int i){
		int count =0;
		if (n <= 2){
			return n==2;
		}
		if(n % i ==0) 
			return false;
		
		if( i * i > n){
			return true;
		}
		
		return primeNumber(n, i + 1);
	}
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		
		boolean isPrime = primeNumber(num, 2);
			

		if(isPrime){
			System.out.println("Output: true");
		}
		else{
			System.out.println("Output: false");
		}
	}
}