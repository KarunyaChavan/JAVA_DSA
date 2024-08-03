package Questions;
import java.util.*;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] a = {{1,2,1},{2,1,2}};
        int[][] b = {{1,0,1,2},{2,1,0,0},{0,3,1,1}};
        if(a[0].length!=b.length)
            System.out.println("Multiplication not possible");
        else{
            int[][] ans = new int[a.length][b[0].length];
            for(int i=0;i<ans.length;i++){
                for(int j=0;j<ans[0].length;j++){
                    for(int k=0;k<b.length;k++){
                        ans[i][j] += a[i][k] + b[k][j];
                    }
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
