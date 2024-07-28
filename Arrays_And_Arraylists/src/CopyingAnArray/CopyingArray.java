package CopyingAnArray;

import java.util.Arrays;

public class CopyingArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int[] num = Arrays.copyOf(arr, arr.length);
        num[0] = 0;
        for(int x: num){
            System.out.print(x + " ");
        }
    }
}