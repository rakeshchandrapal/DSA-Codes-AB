package Arrays.Array_Basic_03.Session;

public class searchInMatrix {

    public static  void main(String[] args)
    {
        int arr[][] = {
                {1,4,5,7},
                {2,5,6,9},
                {6,10,11,13}
        };
        int key = 15;
        System.out.println( SearchInMatrix(arr,key));

    }


    static boolean SearchInMatrix(int a[][] ,int key){
        int len = a.length;
        int row = 0;
        int col = len - 1;
        while(row < len && col >= 0)
        {
            if(a[row][col] == key)
            {
                return true;
            }
            else if(key > a[row][col])
            {
                row++;
            }
            else {
                col--;
            }
        }
        return  false;
    }
}