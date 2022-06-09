package _03_array_and_method.exercise.s1;

import java.util.Arrays;

public class ColumnTotalCalculate {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int)Math.round(Math.random()*50)+1;
            }
        }

        int col = 2;
        int res=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(j==1)
                    res+=a[i][j];
            }
        }

        for (int[] e: a) {
            System.out.println(Arrays.toString(e));
        }

        System.out.println(res);
    }
}
