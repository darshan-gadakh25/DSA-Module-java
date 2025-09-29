import java.util.*;
public class Q4{
	public static void  mergeSort(int arr[], int left, int right){
		
		if(left >= right){
			return;
		}
		int mid= (left+right) / 2;
		
		mergeSort(arr, left, mid);
		
		mergeSort(arr, mid +1, right);
		
		int [] temp=new int [right - left + 1];
		
		int i=left, j=mid+1, k=0;
		while(i<=mid && j <= right){
			if(arr[i] <arr[j]){
				temp[k++]=arr[i++];
			}
			else{
				temp[k++]= arr[j++];
			}
		}
		
		while(i<=mid){
			temp[k++]=arr[i++];
		}
		
		while(j<=right){
			temp[k++]= arr[j++];
		}
		
		for(int a=0;a<temp.length;a++){
			arr[left+a] = temp[a];
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String [] args){
		
		int arr[]={38, 27, 43, 3, 9, 82, 10};
		mergeSort(arr,0,arr.length-1);
	}
}
