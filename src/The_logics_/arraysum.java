package The_logics_;

public class arraysum {

	public static void main(String[] args) {
		
		int arr[] = {1,2,1,3,6,0,8,180};
		
		//int target=180;
		
		//System.out.println((method(arr,target)));
		method(arr);

	}
	
	static void method(int[]arr) {
		
		int sum=0;
//		for(int i =0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				for(int z=j+1;z<arr.length;z++) {
//					if(arr[i]*arr[j]*arr[z]==target)
//					return arr[i]+" "+arr[j]+" "+arr[z];
//				}
//			}		
	//	}
//	return -1+""+-1+" "+-1+" ";	
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
		int l=String.valueOf(sum).length();
		int sum2=0,r;
		
		for(int i=0;i<l;i++) {
			
			r=sum%10;
			sum=sum/10;
			sum2=sum2+r;
		}
		System.out.println(sum2);
	}

}
