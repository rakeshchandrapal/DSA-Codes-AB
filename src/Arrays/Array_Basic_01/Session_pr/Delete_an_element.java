
package Arrays.Array_Basic_01.Session_pr;
import java.util.Scanner;


public class Delete_an_element {
    static void delete(int[] arr, int key) {
        int n = arr.length;
        int i;
        for ( i = 0; i < n; i++) {
            if (arr[i] == key) {
                break;
            }
        }
        if (i == n) {
            return;

        }
        for (int j = i; j < n - 1; j++) {
            arr[j] = arr[j + 1];
        }
        return;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of array : ");
        int len = sc.nextInt();
        int[] array = new int[len];
        System.out.println("Enter The Element Of The array ");
        for (int e : array) {
            e = sc.nextInt();
        }
        System.out.println("Enter the elment Which you want to delete in array :");
        int k = sc.nextInt();
//        int[] arr= {1,2,3,4,5};
//        int k = 4;
        delete(array, k);
        System.out.println("The array after deleting The element is : ");

        for (int elem : array) {
            System.out.print("[" + elem + "] ");
        }

    }

}