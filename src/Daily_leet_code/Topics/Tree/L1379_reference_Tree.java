package Daily_leet_code.Topics.Tree;

public class L1379_reference_Tree {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {

        if( original == target || original == null  )
        {
            return cloned;
        }

        TreeNode Oleft = getTargetCopy(original.left,cloned.left,target);
        if(Oleft != null) return Oleft;

        TreeNode Oright = getTargetCopy(original.right,cloned.right,target);
        return Oright;

    }


}