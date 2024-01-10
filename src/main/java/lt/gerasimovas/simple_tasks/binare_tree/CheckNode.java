package lt.gerasimovas.simple_tasks.binare_tree;



public class CheckNode {
    public boolean isSameTree(TreeNode p, TreeNode q){

        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null || p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);


    }


}
