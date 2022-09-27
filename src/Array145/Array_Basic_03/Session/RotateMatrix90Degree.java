package Array145.Array_Basic_03.Session;

public class RotateMatrix90Degree {
    static void printMatrix(int arr[][])
    {
        int n = arr.length;;
        for(int i = 0; i < n ; i++)
        {
            for(int j = 0; j < n ; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[]  args)
    {
//        int a[][] = {
//                {1,2,3,4},
//                {5,6,7,8},
//                {9,10,11,12},
//                {13,14,15,16}
//        };
        int a[][] = {
                {1,2,3},
                {5,6,7},
                {9,10,11},

        };
        System.out.println("<-- Before -->");
        printMatrix(a);
        transposeMatrix(a);
        Rotate90Dgree(a);
        System.out.println("<-- After -->");
        printMatrix(a);
  }
    static void transposeMatrix(int [][] arr)
    {
        int len = arr.length;
            for(int i = 0; i < len ; i++)
            {
                for(int j = i; j < len ; j++)
                {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
    }

    static void Rotate90Dgree(int arr[][])
    {
        int len = arr.length;
        for(int i = 0; i < len ; i++)
        {
            for(int j = 0; j < len/2 ; j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[i][len-j-1];
                arr[i][len-j-1] = temp;
            }
        }
    }

}