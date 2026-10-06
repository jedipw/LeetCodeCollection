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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;

        while (p != null || !stack.isEmpty()) {
            if (p != null) {
                res.add(p.val);
                stack.push(p);
                p = p.right;
            } else {
                p = stack.pop();
                p = p.left;
            }
        }

        Collections.reverse(res);
        return res;
    }
}