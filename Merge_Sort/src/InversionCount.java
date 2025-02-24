//Inversion are such paris - i < j where arr[i] > arr[j]
//Leetcode 493 - Reverse Pair (My First Hard Problem)
public class InversionCount {
	static int count;
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
	public static void countInversion(int[] a, int[] b){
		int i=0, j=0;
		while(i<a.length && j<b.length){
			if(a[i]>b[j]){
				count += (a.length - i);
				j++;
			}
			else i++;
		}
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
		//for inversion count
		countInversion(sub1,sub2);
		//merging two sub arrays
		merge(sub1,sub2,arr);
		//Deleting sub arrays after merging with improves S.C form O(nlogn) to O(n)
		sub1 = null; sub2 = null;
	}
	public static void main(String[] args) {
		int[] arr = {109,33,89,27,60,10,70};
		mergeSort(arr);
		System.out.println("Inversion Count : " + count);
	}
}
