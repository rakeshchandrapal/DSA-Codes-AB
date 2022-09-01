package Binary_Search.Part_1;

public class SerchIninfiniteArray {

    public static int SearchInInfiniteArray(int[] arr,int key)
    {
        if(arr.length == 0) return  -1;
        if(arr[0] == key) return 0;
        int index = 1;
         while(arr[index] <= key)
         {
             index = index * 2;
         }

         return binarySearch(arr,key,index/2,index);

    }
    public static int binarySearch(int[] arr,int key,int l , int r)
    {

        while(l <= r)
        {
//            int mid = (l+r)/2;
            int mid = l + (r - l)/2;
            if(arr[mid] == key) return  mid;
            if(key > arr[mid]) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
         int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,15,16,17,18,19,45,46,48,49,70,75,78,79};
         int key = 15;
        System.out.println( SearchInInfiniteArray( arr, key));
    }
}