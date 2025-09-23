import java.util.*;

public class EvenOddElement{
	static int even=0,odd=0;

	static void findElement(int [] arr,int i){
		if( i == arr.length){
			System.out.println("Even: "+even+", Odd: "+odd);
			return;
		}
		else{
			if(arr[i] % 2 == 0){
				even++;
			}
			else{
				 odd++;
			}
			
		}
		findElement(arr,i+1);
		
	}
	
	public static void main(String [] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		
		int [] arr=new int[size];
		
		for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
		findElement(arr,0);
		
	}
}