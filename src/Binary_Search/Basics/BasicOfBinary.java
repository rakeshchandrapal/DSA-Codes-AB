package Binary_Search.Basics;

public class BasicOfBinary {
    public static void main(String[] args) {
        int [] arr = {1,4,6,7,9,10,11,14,15};
        int key = 11;
        int[] arr2 = {1,1,3,4,4,4,4,4,4,5,6,6};
        int key2 = 4;
        int left = leftOccurrence(arr2,key2);
        int right  = rightOccurrence(arr2,key2);
        int count = right - left + 1;
        System.out.println("The Index of Key is "+ binarySearch(arr,key));
        System.out.println("The Index of First Occurrence in array is "+ left);
        System.out.println("The Index of Last Occurrence in array is "+ right);
        System.out.println("The Number is repeated " + count + " Times");

    }

    public static int binarySearch(int[] arr, int key)
    {
        int l = 0;
        int r = arr.length - 1;
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

    public static int leftOccurrence(int[] arr , int key)
    {
        // left side because we have to find the first occurrence
        int l = 0;
        int r = arr.length - 1;
        int ans = -1;
        while(l <= r)
        {
            int mid = (l+r)/2;
//            int mid = l + (r - l)/2;
            if(arr[mid] == key)
            {
                ans = mid;
                r = mid -1;
            }
            else if(key > arr[mid]) l = mid + 1;
            else r = mid - 1;
        }
        return ans;
    }
    public static int rightOccurrence(int[] arr , int key)
    {
        // right side because we have to find the last occurrence
        int l = 0;
        int r = arr.length - 1;
        int ans = -1;
        while(l <= r)
        {
            int mid = (l+r)/2;
//            int mid = l + (r - l)/2;
            if(arr[mid] == key)
            {
                ans = mid;
                l = mid +1;
            }
           else if(key > arr[mid]) l = mid + 1;
            else r = mid - 1;
        }
        return ans;
    }



}