package Questions;

public class MaximumNum {
    public static void main(String[] args) {

        int[][] mat = {{3,2,1},{11,23,16}, {14,18,12}};
        int max = Integer.MIN_VALUE;
        int rows = mat.length;
        int cols = mat[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(mat[i][j]>max)
                    max = mat[i][j];
            }
        }
        System.out.println("Maximum Value = " + max);
    }
}