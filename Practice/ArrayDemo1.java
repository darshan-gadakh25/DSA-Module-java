import java.util.*;

public class ArrayDemo1{
	static int binearySerach(int arr[],int value, int l,int h){
		if(h >= l){
			int mid = l + (h - l) / 2;
			
			if(arr[mid] == value)
				return mid;
			else if(arr[mid] > value)
				return binearySerach(arr,value,l,mid -1);
			else
				return binearySerach(arr,value,mid + 1,h);
			
		}	
		return -1;

	}
	public static void main(String [] args){
		
	int arr[]={21,4,3,65,7,65,34,8};
	Arrays.sort(arr);
		System.out.println("Binary search element  :" +binearySerach(arr,65,0,arr.length-1));

	}
}