package MergingSortedArrs;

public class MergeTwoSorted2 {
    public static void main(String[] args) {
        int[] a = {11,33,42,71};
        int[] b = {26,54,69,81,94,99};
        int[] c = new int[a.length + b.length];
        int i = a.length-1, j = b.length-1, k = c.length-1;
        while(i>=0 && j>=0){
            if(a[i]>=b[j]){
                c[k] = a[i--];
            }
            else{
                c[k] = b[j--];
            }
            k--;
        }
        if(i<0){
            while(j>=0){
                c[k--] = b[j--];
            }
        }
        if(j<0){
            while(i>=0){
                c[k--] = a[i--];
            }
        }
        for(int ele : c){
            System.out.print(ele + " , ");
        }
    }
}
