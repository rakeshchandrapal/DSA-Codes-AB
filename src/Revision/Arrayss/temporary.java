package Revision.Arrayss;

import java.util.Arrays;

public class temporary{


    public static  void moveZeroes(int[] nums) {
        int insertPos = 0;

        for(int em : nums){
            if(em != 0) nums[insertPos++] = em;
        }
        while(insertPos < nums.length){
            nums[insertPos++] = 0;
        }
        return;
    }

    public static void main(String[] args) {
//        int[]a  = {1,8,6,2,5,4,8,3,7};
//        System.out.println(containerWithMostWater(a));

        int []a = {1,0,2,1,0,1,3,2,1,2,1};
        moveZeroes(a);
        System.out.println(Arrays.toString(a));
    }
}