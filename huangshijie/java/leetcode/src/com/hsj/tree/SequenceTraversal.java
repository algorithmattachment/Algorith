package com.hsj.tree;


import java.util.ArrayList;
import java.util.List;

/**
 * 中序遍历
 * @author 黄仕杰
 * @date 2019/07/14
 */
public class SequenceTraversal {
    private List<Integer> sequenceList = new ArrayList<>();
    private class TreeNode{
    int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    /**
     * 对以root为根节点的二叉树进行遍历
     * @param root 根节点
     * @return
     */
  public List<Integer> inorderTraversal(TreeNode root) {
      if (root == null) {
          return null;
      }
      inorderTraversal(root.left);
      sequenceList.add(root.val);
      inorderTraversal(root.right);
      return sequenceList;
  }
}
