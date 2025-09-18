import java.util.*;

public class SquareNumber1{
	static int res = 1;
	static int squarRoot(int n) {
		if( res * res > n){
			return res -1;
		}
        else{
			res++; 
			return squarRoot(n);
		}
       
    }
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		
			System.out.println(squarRoot(num));
		
	}
}