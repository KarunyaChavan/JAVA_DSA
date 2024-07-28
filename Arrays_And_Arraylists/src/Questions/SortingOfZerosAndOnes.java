package Questions;

public class SortingOfZerosAndOnes {
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,1,0,0,0,1,0};
        //Method 1 - Count and Store. (TWO PASS SOLUTION)
//        int no_of_zeros = 0;
//        for(int x=0;x<arr.length;x++){
//            if(arr[x]==0)
//                no_of_zeros++;
//        }
//        System.out.println(no_of_zeros);
//        for(int i=0;i<arr.length;i++){
//            if(i<no_of_zeros)
//                arr[i] = 0;
//            else arr[i] = 1;
//        }
//        for(int ele: arr)
//            System.out.print(ele + " , ");

        //Method 2 - One Pass Solution
        int i=0, j = arr.length - 1;
        while(i<j){
            if(arr[i]==0) i++;
            if(arr[j]==1) j--;
            if(i<j && arr[i]==1 && arr[j]==0){
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
        for(int ele : arr){
            System.out.print(ele + " , ");
        }
    }
}
