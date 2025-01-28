package QSpider;

import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
//        matrixMul();
        matTranspose();
    }

    private static void matTranspose(){
        int[][] mat = {{1,2,3}, {4,5,6}};
        int[][] res = new int[mat[0].length][mat.length];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                res[i][j] = mat[j][i];
            }
        }
        System.out.println(Arrays.deepToString(res));
    }

    private static void matrixMul() {
        int[][] mat1 = {{1, 2}, {4, 5}};
        int[][] mat2 = {{1, 2}, {3, 4}};

        if (mat1[0].length != mat2.length) {
            System.out.println("Matrox not valid");
            return;
        }

        int[][] ans = new int[mat1.length][mat2[0].length];

        for (int i = 0; i <ans.length; i++) {
            for (int j = 0; j <ans[i].length; j++) {
                for (int k = 0; k < mat1[i].length; k++) {
                    ans[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(ans));
    }
}
