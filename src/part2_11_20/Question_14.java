package part2_11_20;


/**
 * @author jacky
 * @time 2020-05-11 16:56
 * @discription 链表中倒数第k个节点 链表
 *              输入一个链表，输出该链表中倒数第k个结点。
 *
 *              Solution:
 *              设链表的长度为 N。设置两个指针 P1 和 P2，先让 P1 移动 K 个节点，
 *              则还有 N - K 个节点可以移动。此时让 P1 和 P2 同时移动，
 *              可以知道当 P1 移动到链表结尾时，P2 移动到第 N - K 个节点处，该位置就是倒数第 K 个节点。
 */
public class Question_14 {

    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null)
            return null;
        ListNode P1 = head;
        while(P1!=null && k-->0){
            P1=P1.next;
        }
        if (k>0)
            return null;
        ListNode P2 = head;
        while(P1!=null){
            P1 = P1.next;
            P2 = P2.next;
        }
        return P2;
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
