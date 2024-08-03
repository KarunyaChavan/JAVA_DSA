package Questions;

public class SearchingInMatrix {
    public static boolean searchMatrix(int[][] arr, int target) {
        int m = arr.length, n = arr[0].length;
        int i=0,j=n-1;
        while(i<m && j>=0){
            if(arr[i][j]==target) return true;
            else if(arr[i][j]>target) j--;
            else i++;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22}};
        System.out.println("Is Present = " + (searchMatrix(arr,6)));
    }
}
