package Array145.Array_Basic_03.Session;

public class Transpose {
    static void printArray(int [][] a)
    {
        for (int i =0;  i  < a.length; i++)
        {
            for (int j =0; j < a.length; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    static  void transpose(int [][] arr)
    {
        int len = arr.length;
            for(int i = 0; i < len ; i++ )
            {
                for(int j = i ; j < len ; j++)
                {
                    int temp  =  arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;

                }
            }
            printArray(arr);
    }
    public static void main (String[] args)
    {
        int arr[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int leng = arr.length;
        printArray(arr);
        transpose(arr);
        System.out.println(leng);
//        printArray(arr);


    }
}