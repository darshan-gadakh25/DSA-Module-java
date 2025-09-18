import java.util.*;

public class GCF{
	
	static int series(int n1,  int n2) {
		
		if(n1 == n2 ){
			return n1;
		}
		else{
			if(n1> n2){
				n1 =n1-n2;
			}
			else {
				n2 = n2 -n1;	 
			}
			return series(n1,n2);
		}
    }
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num1 = sc.nextInt();
		int num2 =sc.nextInt();
		
		int cf =series(num1,num2);	
		System.out.println(cf);
	}
}