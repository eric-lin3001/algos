//如果二叉树每个节点都具有相同的值，那么该二叉树就是单值二叉树。 
//
// 只有给定的树是单值二叉树时，才返回 true；否则返回 false。 
//
// 
//
// 示例 1： 
//
// 
//
// 输入：[1,1,1,1,1,null,1]
//输出：true
// 
//
// 示例 2： 
//
// 
//
// 输入：[2,2,2,5,2]
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 给定树的节点数范围是 [1, 100]。 
// 每个节点的值都是整数，范围为 [0, 99] 。 
// 
// Related Topics 树 
// 👍 69 👎 0


package leetcode.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class UnivaluedBinaryTree {
    public static void main(String[] args) {
        Solution solution = new UnivaluedBinaryTree().new Solution();
        TreeNode treeNode = new TreeNode(3);
        TreeNode treeNodeLeft = new TreeNode(4);
        treeNode.left =treeNodeLeft;
        TreeNode treeNodeLeftLeft = new TreeNode(5);
        treeNodeLeft.left =treeNodeLeftLeft;
        TreeNode treeNodeRight = new TreeNode(6);
        treeNode.right = treeNodeRight;
        solution.isUnivalTree(treeNode);
    }
    //leetcode submit region begin(Prohibit modification and deletion)


      public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
      }

    class Solution {
        List<Integer> vals;

        public boolean isUnivalTree(TreeNode root) {
            vals = new ArrayList<>();
            dfs(root);
            for(int v:vals){
                if(v!=vals.get(0)){
                    return false;
                }
            }
            return true;
        }

        public void dfs(TreeNode treeNode) {
            if (treeNode != null) {
                vals.add(treeNode.val);
                dfs(treeNode.left);
                dfs(treeNode.right);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}