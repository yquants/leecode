package com.wilson.leecode.simple;

/**
 * https://leetcode-cn.com/problems/root-equals-sum-of-children/
 */
public class P2236 {

    public boolean checkTree(TreeNode root) {

        return root.val == root.left.val + root.right.val;


    }

    public static void main(String... args) {
        P2236 instance = new P2236();
    }

}
