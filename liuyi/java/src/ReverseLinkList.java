public class ReverseLinkList {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head){
        if(head==null&&head.next==null)
            return head;
        ListNode reshead = null;                //反转后的头结点
        ListNode curNode = head;                //保存当前节点
        ListNode preNode = null;                //保存之前节点
        while(curNode!=null){
            ListNode temNode = curNode.next;    //临时保存当前下一个节点
            if (temNode==null)
                reshead = curNode;
            /**修改当前节点下一个指向，使之指向前一个
             * 移动preNode节点指向，移动到下一个节点处，即目前的节点
             * 同理移动当前节点到下一个节点处
             */
            curNode.next = preNode;
            preNode = curNode;
            curNode = temNode;
        }
        return reshead;
    }
}

