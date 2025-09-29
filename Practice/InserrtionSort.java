
public class InserrtionSort{
	static int [] insertSort(int arr[]){
		
		for (int i=1;i<arr.length ;i++){
			int temp=arr[i];
			int j;
			for( j=i-1;j>=0 &&  temp <arr[j];j--){
				arr[j+1]=arr[j];
			}
			arr[j+1]=temp;
		}
		return arr;
	}
	public static void main(String [] args){
		
		int arr[]={9,2,4,7,1,2,3};
		
		int [] sort=insertSort(arr);
		for(int i=0;i<sort.length;i++){
			System.out.print(sort[i]+" ");
		}
	}
}