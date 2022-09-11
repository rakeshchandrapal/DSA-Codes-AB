package LeetCode.Contest;

import java.util.*;

public class L6176 {

    public static void main(String[] args) {

    }

    public int mostFrequentEven(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                if (map.containsKey(nums[i])) {
                    int temp = map.get(nums[i]);
                    map.put(nums[i], temp + 1);
                } else {
                    map.put(nums[i], 1);
                }
            }
        }

        int ans = -1, prevValue = -1, prevKey = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (prevValue == value) {
                if (prevKey > key) {
                    ans = key;
                    prevKey = key;
                }
            } else if (prevValue < value) {
                prevKey = key;
                prevValue = value;
                ans = key;
            }
        }
            return ans;
    }

}