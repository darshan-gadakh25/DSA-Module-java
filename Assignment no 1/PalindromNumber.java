import java.util.*;

public class PalindromNumber{
	static int res =0;
	static int palindrom(int n) {
		if( n == 0){
			return 0;
		}
        else{
			int rem = n % 10; 
			res = res * 10 + rem ;
			palindrom(n / 10);
			return  res;
		}
       
    }
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		
		int reverse= palindrom(num);
		System.out.println("reverse:"+reverse);
		if(num == reverse && reverse > 0){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		
	}
}