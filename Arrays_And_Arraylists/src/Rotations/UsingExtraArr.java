package Rotations;

public class UsingExtraArr {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int n = arr.length;
        int k = 3;
        int[] rotated_arr = new int[n];
        int j = 0;
        for(int i=n-k;i<n;i++){
            rotated_arr[j++] = arr[i];
        }
        j = 0;
        for(int i=k;i<n;i++){
            rotated_arr[i] = arr[j++];
        }
        for(int x: rotated_arr){
            System.out.print(x + " , ");
        }
    }
}
