package BinaryTreeBasics.Part01;


import BinaryTreeBasics.TreeNode;
import com.sun.source.tree.Tree;

import java.util.*;

public class L102_LevelOrderTraversal {

    public static void main(String[] args) {

    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        List<Integer> curList = new ArrayList<>();
        while(!q.isEmpty())
        {
            TreeNode cur = q.poll();
            if(cur == null)
            {
                ans.add(curList);
                if(q.isEmpty()) return ans;
                q.add(null);
                curList = new ArrayList<>();
            }
            else
            {
                curList.add(cur.val);
                if(cur.left != null)
                {
                    q.add(cur.left);
                }
                if(cur.right != null)
                {
                    q.add(cur.right);
                }

            }
        }
        return ans;
    }
}