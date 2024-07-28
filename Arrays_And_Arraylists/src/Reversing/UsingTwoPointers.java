package Reversing;

public class UsingTwoPointers {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        //Specific part of an array can be reversed by setting initials
        int j = arr.length-1;
        int i = 0;
        while(i<=j){
            int temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
//            i++;
//            j--;
        }
        System.out.print("Reversed Array - ");
        for(int ele:arr){
            System.out.print(ele + " , ");
        }
        System.out.println();
    }
}
