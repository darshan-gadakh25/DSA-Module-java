import java.util.*;

public class SquareNumber{
	static int square(int n){ 
		 if (n == 0){
			return 0;
		}
		else{
			
			
			return n * square( n);
		}
	}
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		
		System.out.println(square(num));
	}
}