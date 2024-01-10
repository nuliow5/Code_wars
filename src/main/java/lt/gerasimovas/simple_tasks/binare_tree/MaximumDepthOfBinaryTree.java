package lt.gerasimovas.simple_tasks.binare_tree;

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }

        int leftDeep = maxDepth(root.left);
        int rightDeep = maxDepth(root.right);

        return Math.max(leftDeep, rightDeep) + 1;

    }
}
