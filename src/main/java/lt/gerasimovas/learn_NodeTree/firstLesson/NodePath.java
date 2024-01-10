package lt.gerasimovas.learn_NodeTree.firstLesson;

/*
    https://www.youtube.com/watch?v=R4UHOLZ-bEk

    1. reikia rasti dydziausia Node value suma.


 */
public class NodePath {

    // 1 task
    public int maxPathSumIfAllNotesValuePositivity(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int maxLeftPathSum = maxPathSumIfAllNotesValuePositivity(root.left);
        int maxRightPathSum = maxPathSumIfAllNotesValuePositivity(root.right);

        return Math.max(maxLeftPathSum, maxRightPathSum) + root.val;
    }
    // 2 TASK --------------------------------------------------------------------

    private int result = 0;
    public int maxPathSumIfNotesCanBeNegative(TreeNode root) {

        helper(root);

        return result;
    }

    private int helper(TreeNode node){
        if (node == null){
            return 0;
        }

        int maxLeftPat = Math.max(helper(node.left), 0);
        int maxRightPath = Math.max(helper(node.right), 0);
        result = Math.max(result, maxLeftPat + maxRightPath + node.val);

        return Math.max(maxRightPath, maxLeftPat) + node.val;
    }

}
