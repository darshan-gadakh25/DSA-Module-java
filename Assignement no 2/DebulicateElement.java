
import java.util.*;

public class DebulicateElement{
	
	static int dublicate(int [] src, int i,int j){
		
		if( src.length == j){
			return -1;
		}
		else{
			if(src[j] == i){
				return src[j];
			}
			return dublicate(src, i, j+1 );
		}
		
	}
	
	public static void main(String [] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		
		int [] src=new int[size];
		for (int i = 0; i < size; i++) {
            src[i] = sc.nextInt();
        }
		
		System.out.println();
		System.out.println("duplicate element in array:");
		
		for (int i = 0; i < src.length; i++) {
			int des=dublicate(src,src[i],i+1);
			if( des >= 0){
				System.out.print(des+" ");
			}
        }
		
		
		
	}
}