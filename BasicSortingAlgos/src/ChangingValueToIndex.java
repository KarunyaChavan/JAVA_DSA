//smallest number will be changed to 0 and largest number will be changes to N - 1
public class ChangingValueToIndex {
	public static void main(String[] args) {
		int[] arr = {54,11,28,91,47,63}; //3,0,1,5,2,4
		int x = 0, n = arr.length;
		for(int i=0;i<n;i++){
			int min = Integer.MAX_VALUE;
			int minidx = -1;
			for(int j=0;j<n;j++){
				if(arr[j]<min && arr[j]>0){
					min = arr[j];
					minidx = j;
				}
			}
			arr[minidx] = x--;
		}
		for(int ele:arr){
			ele *= -1;
			System.out.print(ele + " , ");
		}
	}
}
