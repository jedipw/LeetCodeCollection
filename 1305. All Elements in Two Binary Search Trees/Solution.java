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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> li = new ArrayList<>();

        traverse(root1, li);
        traverse(root2, li);

        Collections.sort(li);

        return li;
    }

    public void traverse(TreeNode node, List<Integer> li) {
        if (node == null) {
            return;
        }

        li.add(node.val);

        traverse(node.left, li);
        traverse(node.right, li);
    }
}