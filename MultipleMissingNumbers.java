package persistent;

public class MultipleMissingNumbers {

	
	public static int missingElements(int arr[],int N) {
		int diff=arr[0]-0;
		for(int i=0;i<N;i++) {
			if(arr[i]-i!=diff) {
				while(diff<arr[i]-i) {
					System.out.println(diff+i);
					diff++;
				}
			}
		}
		
		return 0;
	}
	
	
	public static void main(String[] args) {

		int arr[]= {5,7,8,10};
		int N=arr.length;
		missingElements(arr,N);
	}

}
