package Matrices;

public class SpiralForm {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        int m = arr.length;
        int n = arr[0].length;
        int minr = 0, maxr = m - 1, minc = 0, maxc = n - 1;
        while (minr <= maxr && minc <= maxc) {
            //left to right - row const but col varies
            for (int j = minc; j <= maxc; j++) {
                System.out.print(arr[minr][j] + " ");
            }
            minr++;
            //top to bottom
            if(minr > maxr || minc > maxc)
                break;
            for (int i = minr; i <= maxr; i++) {
                System.out.print(arr[i][maxc] + " ");
            }
            maxc--;
            //right to left
            for (int j = maxc; j >= minc; j--) {
                System.out.print(arr[maxr][j] + " ");
            }
            maxr--;
            //bottom to top
            for (int i = maxr; i >= minr; i--) {
                System.out.print(arr[i][minc] + " ");
            }
            minc++;
        }
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                System.out.print(arr[i][j] + " ");
//            }
//        }
    }
}
