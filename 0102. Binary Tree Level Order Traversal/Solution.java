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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        pre(root, 0, res);

        return res;
    }

    public static void pre(TreeNode root, int l, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        if (res.size() == l) {
            List<Integer> list = new ArrayList<>();
            list.add(root.val);
            res.add(list);
        } else
            res.get(l).add(root.val);

        pre(root.left, l + 1, res);
        pre(root.right, l + 1, res);
    }
}