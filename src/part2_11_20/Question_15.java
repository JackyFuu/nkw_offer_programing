package part2_11_20;

/**
 * @author jacky
 * @time 2020-05-11 17:09
 * @discription 反转链表 链表
 *              输入一个链表，反转链表后，输出新链表的表头
 *
 *
 */
public class Question_15 {
    //递归
    public ListNode ReverseList(ListNode head) {
        if (head==null || head.next==null)
            return head;
        ListNode next = head.next;
        head.next = null;
        ListNode newHead = ReverseList(next);
        next.next = head;
        return newHead;
    }
    //迭代,使用头插法。
    public ListNode ReverseList_1(ListNode head) {
        ListNode newList = new ListNode(-1);
        while(head!=null){
            ListNode next = head.next;
            head.next=newList.next;
            newList.next=head;
            head = next;
        }
        return newList.next;
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
