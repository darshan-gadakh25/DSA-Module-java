
import java.util.*;

public class CopyArray{
	
	static int[] copyArray(int [] src,int[] des, int i){
		
		if( i == src.length){
			return des;
		}
		else{
			des[i] = src[i];	
			return copyArray(src,des, i+1);
		}
		
		
	}
	
	public static void main(String [] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		
		int [] src=new int[size];
		int [] des=new int[src.length];
		for (int i = 0; i < size; i++) {
            src[i] = sc.nextInt();
        }
		
		System.out.println();
		System.out.println("Please Enter the element to search in array:");
		int element=sc.nextInt();
		System.out.println("Elemenet copy in next array:");
		des=copyArray(src,des,0);
		
		
		for (int i = 0; i < des.length; i++) {
			System.out.print(des[i]+" ");
        }
		
	}
}