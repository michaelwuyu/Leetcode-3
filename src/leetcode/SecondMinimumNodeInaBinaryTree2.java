package leetcode;

import java.util.HashSet;
import java.util.Set;

public class SecondMinimumNodeInaBinaryTree2 {

    int min1;
    int ans = Integer.MAX_VALUE;

    public int findSecondMinimumValue(TreeNode root) {
        min1 = root.val;
        dfs(root);
        return ans < Integer.MAX_VALUE ? ans : -1;
    }

    public void dfs(TreeNode root) {
        if (root == null)
            return;
        if (min1 < root.val && root.val < ans) {
            ans = root.val;
        } else if (min1 == root.val) {
            dfs(root.left);
            dfs(root.right);
        }
    }
}
