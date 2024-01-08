package lt.gerasimovas.simple_tasks.binare_tree;

/*
    https://www.youtube.com/watch?v=OvlFX_QdHnc
 */

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);

        return result;
    }

    public void helper(TreeNode root, List<Integer> result){
        if (root != null){
            helper(root.left, result);
            result.add(root.val);
            helper(root.right, result);
        }
    }
}
