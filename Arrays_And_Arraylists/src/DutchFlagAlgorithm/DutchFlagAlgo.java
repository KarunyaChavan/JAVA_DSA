package DutchFlagAlgorithm;

public class DutchFlagAlgo {
    public static void main(String[] args) {
        //This problem is also known as Sorting of zeros, ones and twos

        //Step 1 - Break array in 4 parts

        //Concept -- All zeros should lie before low, all ones should lie before mid and all twos should lies after high

        int[] arr = {0,1,2,2,1,2,1,2,0,0};
        int n = arr.length;
        int mid = 0, high = n-1, low = 0;
        while(mid<=high){
            if(arr[mid]==0){
                int temp = arr[mid];
                arr[mid++] = arr[low];
                arr[low++] = temp;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high--] = temp;
            }
        }
        for(int x : arr){
            System.out.print(x + " , ");
        }
    }
}
