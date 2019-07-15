package com.hsj.list;

import java.util.LinkedList;


/**
 * @author 黄仕杰
 */
public class ListNode<T> {
    public class Node {
        private T val;
        Node next;

        public Node(T val, Node next) {
            this.val = val;
            this.next = next;
        }
        public Node() {
            this(null, null);
        }
    }
    private Node node;
    private Node dummyyHead;
    private int size;
    public ListNode(){
        dummyyHead = new Node();
        size = 0;
    }

    public int getSize() {
        return size;
    }
    /**
     * 向链表尾添加元素
     * @param number 添加的元素
     */
    public void addLirst(T number) {
        Node prev = dummyyHead;
        for (int i = 0; i < size; i++) {
            prev = prev.next;
        }
        prev.next = new Node(number, prev.next);
        size++;
    }

    /**
     * 删除链表中的元素
     * @return
     */
    public T remove() {
        Node prev = dummyyHead;
        for (int i = 0; i < size-1; i++) {
            prev = prev.next;
        }
        Node renode = prev.next;
        prev.next = renode.next;
        renode.next = null;
        size--;
        return renode.val;
    }


    @Override
    public String toString() {
        StringBuilder sre = new StringBuilder();
        Node cre = dummyyHead.next;
        while (cre!=null){
            sre.append(cre.val+"->");
            cre = cre.next;
        }
        sre.append("NULL");
        return sre.toString();
    }
}
