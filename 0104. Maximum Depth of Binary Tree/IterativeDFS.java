/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> value = new Stack<>();

        int result = 0;

        stack.push(root);
        value.push(1);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            int n = value.pop();
            result = Math.max(result, n);
            if (node.left != null) {
                stack.push(node.left);
                value.push(n + 1);
            }
            if (node.right != null) {
                stack.push(node.right);
                value.push(n + 1);
            }
        }

        return result;
    }
}