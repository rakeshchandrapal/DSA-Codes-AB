package LeetCode.Daily;

import java.util.Arrays;

public class L48_Rotate_a_Image {

    public static void rotate(int[][] matrix) {

        int n = matrix.length;
        for(int i = 0; i < n ; i++)
        {
            for(int j = i; j< matrix[0].length; j++)
            {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
            }
        }

        for(int [] rows : matrix)
        {
            reverse(rows);
        }



    }

    public static void reverse (int[] arr)
    {
        int i = 0, j = arr.length - 1;
        while(i < j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }


    public static void main(String[] args) {


        int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(a);
    for(int [] r : a)
    {
        System.out.println(Arrays.toString(r));
    }

    }

}