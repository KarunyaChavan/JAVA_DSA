public class MoveZeros {
	public static void main(String[] args) {
		int[] arr = {1,0,4,0,2,-40,100,0,5};
		int noOfzs = 0;
		for(int i=0;i<(arr.length);i++) {
			if(arr[i]==0) noOfzs++;
		}
		for(int i=0;i<(arr.length - noOfzs);i++){
			if(arr[i] == 0){
				arr[i] = arr[i+1];
				arr[i+1] = 0;
			}
		}
		for(int ele : arr){
			System.out.print(ele + " ,");
		}
	}
}
