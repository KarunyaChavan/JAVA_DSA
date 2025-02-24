public class MergeSort {
	public static void printArr(int[] arr){
		for(int i : arr){
			System.out.print(i + " ");
		}
	}
	public static void merge(int[] a, int[] b, int[] c){
		int i=0, j=0, k=0;
		while(i<a.length && j<b.length){
			if(a[i]<=b[j]) c[k++] = a[i++];
			else c[k++] = b[j++];
		}
		while(j<b.length) c[k++] = b[j++];
		while(i<a.length) c[k++] = a[i++];
	}
	public static void mergeSort(int[] arr){
		int n = arr.length;
		if(n==1) return;
		//create two arrays of n/2 size each
		int[] sub1 = new int[n/2];
		int[] sub2 = new int[n - n/2]; //such length dividing works fine for odd len too
		//copying the elements into two sub arrays
		for(int i=0;i<n/2;i++){
			sub1[i] = arr[i];
		}
		for(int i=0;i<n-n/2;i++){
			sub2[i] = arr[i + n/2];
		}
		//magic
		mergeSort(sub1);
		mergeSort(sub2);
		//merging two sub arrays
		merge(sub1,sub2,arr);
		//Deleting sub arrays after merging with improves S.C form O(nlogn) to O(n)
		sub1 = null; sub2 = null;
	}
	public static void main(String[] args) {
		int[] arr = {80,10,70,50,60,30,40,20};
		System.out.print("Unsorted Array : ");;printArr(arr);
		mergeSort(arr);
		System.out.print("\nSorted Array : ");;printArr(arr);
	}
}