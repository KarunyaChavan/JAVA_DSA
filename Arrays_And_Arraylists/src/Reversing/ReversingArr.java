package Reversing;

public class ReversingArr {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int n = arr.length;
        System.out.print("Original Array = ");
        for(int x : arr){
            System.out.print(x + " , ");
        }
        System.out.println();
        System.out.print("After Reversing = ");
        for(int i=0;i<n/2;i++){
            int rev_index = n-i-1;
            int temp = arr[i];
            arr[i] = arr[rev_index];
            arr[rev_index] = temp;
        }
        for(int ele : arr){
            System.out.print(ele + " , ");
        }
    }
}
