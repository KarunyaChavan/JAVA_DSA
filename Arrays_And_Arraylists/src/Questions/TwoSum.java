package Questions;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {5,2,1,4,3};
        int target = 9;
        int n = arr.length;
        for(int i=0;i<n;i++){
            int flag = 0;
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(i + " , "+j);
                    flag = 1;
                    break;
                }
            }
            if(flag==1)
                break;
        }
    }
}
