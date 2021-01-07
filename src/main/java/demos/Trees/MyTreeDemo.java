package demos.Trees;

import java.util.ArrayList;
import java.util.List;

public class  MyTreeDemo{

    public static class TreeNode {

        // 左节点(儿子)
        private TreeNode lefTreeNode;

        // 右节点(儿子)
        private TreeNode rightNode;

        // 数据
        private int value;


        public TreeNode(int value) {
            this.value =value;
        }

        public void setLefTreeNode(TreeNode lefTreeNode) {
            this.lefTreeNode = lefTreeNode;
        }

        public void setRightNode(TreeNode rightNode) {
            this.rightNode = rightNode;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    // 前序遍历： 根-左-右
    public void preOrderTraversal(TreeNode treeNode){
        if(treeNode==null){
            System.out.println("该节点为空");
        }

        if(treeNode!=null){
            Integer value = treeNode.value;
            System.out.println("该节点有值,节点值为：" + value);
            preOrderTraversal(treeNode.lefTreeNode);
            preOrderTraversal(treeNode.rightNode);
        }
    }


    public static void main(String[] args) {
        MyTreeDemo m = new MyTreeDemo();
        TreeNode t1= new TreeNode(10);
        TreeNode t2= new TreeNode(9);
        TreeNode t3= new TreeNode(20);
        TreeNode t4= new TreeNode(50);

        t1.setLefTreeNode(t2);
        t1.setRightNode(t3);
        t3.setLefTreeNode(t4);
        m.preOrderTraversal(t1);

    }

}
