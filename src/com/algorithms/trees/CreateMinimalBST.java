package com.algorithms.trees;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by sai on 9/16/2017.
 * create minimal Binary Search Tree, given a sorted array(ascending order)
 */
class TreeNode {
    int value;
    TreeNode left,right;
    public TreeNode(int value) {
        this.value = value;
    }
}
public class CreateMinimalBST {
    int[] input = { 1, 3, 5, 9, 11, 20, 30, 40, 50, 60, 70, 80, 90, 111, 222, 333, 444, 555, 666};

    public TreeNode createMinimalBST(int[] inputArray) {
        return createMinimalBST(inputArray, 0, inputArray.length-1);
    }

    public TreeNode createMinimalBST(int[] inputArray, int start, int end) {
        if(end < start)
            return null;
        int mid = (start+end)/2;
        TreeNode root = new TreeNode(inputArray[mid]);
        root.left = createMinimalBST(inputArray, start, mid-1);
        root.right = createMinimalBST(inputArray, mid+1, end);
        return root;
    }

    public void printTreeInorder(TreeNode root) {
        if(root != null) {
            printTreeInorder(root.left);
            System.out.print(root.value+",");
            printTreeInorder(root.right);
        }
    }
    public static void main(String[] args){
        CreateMinimalBST util = new CreateMinimalBST();
        TreeNode root = util.createMinimalBST(util.input);
        util.printTreeInorder(root);
        // you will see the same order as input array, since we are traversing the BST inorder
        ArrayList<Integer> list = new ArrayList<>();
        TreeSet<Integer> set = new TreeSet<>();

    }
}

