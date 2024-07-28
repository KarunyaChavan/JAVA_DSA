package MergingSortedArrs;

public class MergeTwoSorted1 {
    public static void main(String[] args) {
        int[] a = {11,33,42,71};
        int[] b = {26,54,69,81,94,99};
        int m = a.length, n = b.length;
        int[] c = new int[m+n];
        int i = 0, j = 0, k = 0;
        while(i< m && j < n){
            if(a[i]<=b[j]){
                c[k] = a[i++];
            }
            else{
                c[k] = b[j++];
            }
            k++;
        }
        if(i==m){
            while(j<n){
                c[k++] = b[j++];
            }
        }
        if(j==n){
            while(i<m){
                c[k++] = b[i++];
            }
        }
        for(int ele : c){
            System.out.print(ele + " , ");
        }
    }
}
