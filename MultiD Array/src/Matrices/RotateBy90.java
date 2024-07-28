package Matrices;

public class RotateBy90 {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int k=0;k<3;k++) {
            for (int i = 0; i < 3 / 2; i++) {
                int rev_index = 3 - i - 1;
                int temp = arr[k][i];
                arr[k][i] = arr[k][rev_index];
                arr[k][rev_index] = temp;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
