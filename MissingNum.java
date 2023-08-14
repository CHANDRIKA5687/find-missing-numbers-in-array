package persistent;

public class MissingNum {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6};
//		int n=arr.length+1;
//		int sum=n*(n+1)/2;
//		for(int num:arr) {
//			sum=sum-num;
//		}
//		System.out.println(sum);
		int sum1=0;
		for(int i=0;i<arr.length;i++) {
			sum1 = sum1+arr[i];
		}
		int sum2=0;
		for(int i=1;i<=6;i++) {
			sum2=sum2+i;
			
		}
		int num=sum2-sum1;
		System.out.println("Missing number is"+num);
	}

}
