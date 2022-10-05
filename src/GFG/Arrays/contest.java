package GFG.Arrays;

import BinaryTreeBasics.Part01.gfg_verticalOrder;

import java.util.*;

public class contest {

    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(45);
        ans.add(46);
        ans.add(47);
        ans.add(4);
        ans.add(459);
        ans.add(45);
        int target = 4;
        for(int i = 0; i < ans.size(); i++)
        {
            if(ans.get(i) == target)
            {
                System.out.println(ans.get(i+1));
            }
        }




    }


}