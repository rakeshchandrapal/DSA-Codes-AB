package Binary_Search.Basics;

public class SearchINRoatated {
    public static void main(String[] args) {
            int [] arr = {4,7,8,9,1,2,3};
            int key  = 2;
        System.out.println(searchInRotatedArray(arr,key));
    }
    public static int searchInRotatedArray(int[] arr,int key)
    {
        int l = 0;
        int r = arr.length;
        while(l <= r)
        {
            int mid = l + (r - l)/2;
            if(arr[mid] == key ) return mid;
            if(arr[l] <= arr[mid])// left part is sorted
            {
                if(key >= arr[l] && key < arr[mid] )// left side is present
                {
                    r = mid -1;
                }
                else// right side is present
                {
                    l = mid + 1;
                }
            }
            else//righ side is sorted
            {
                if(key > arr[mid] && key <= arr[r])// right side is present
                {
                    l = mid + 1;
                }
                else// left side is present
                {
                    r = mid - 1;
                }
            }
        }
        return  -1;
    }

}