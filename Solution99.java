
public class Solution99 {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        
        TreeNode(int x) {
            val = x;
        }
    }
    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean helper(TreeNode root, long min, long max) {
        if(root == null) {
            return true;
        }

        if(root.val<=min || root.val>=max) {
            return false;
        }

        boolean leftAns = helper(root.left, min, root.val);
        boolean rightAns = helper(root.right, root.val, max);

        return leftAns && rightAns;
    }

    public static void main(String[] args) {
        
        Solution99 solution = new Solution99();
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        boolean isValid = solution.isValidBST(root);
        System.out.println("Is the tree a valid BST? " + isValid);
    }
}
