import java.util.*;

public class ArmStrongNumber{
	static int armStroongNumber(int n){
		if (n == 0){
			return 0;
		}
		else{
			
			int rem= n % 10;

			return(rem *rem*rem) + armStroongNumber( n / 10);
		}
	}
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		
		int reverse = armStroongNumber(num);
	
		if(num == reverse){
			System.out.println("Output: true");
		}
		else{
			System.out.println("Output: false");
		}
	}
}