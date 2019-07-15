package com.hsj.list;

import com.hsj.RemoveDuplocates;

/**
 * @author 黄仕杰
 * @date 2019/07/04
 */
public class ReverseALinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode<Integer> newNode = new ListNode();
        int size = head.getSize();
        for (int i = 0; i < size; i++) {
            newNode.addLirst(newNode.remove());
        }
        return newNode;
    }
}
