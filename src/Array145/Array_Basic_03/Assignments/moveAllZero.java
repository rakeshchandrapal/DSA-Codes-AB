package Array145.Array_Basic_03.Assignments;

public class moveAllZero {
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
}