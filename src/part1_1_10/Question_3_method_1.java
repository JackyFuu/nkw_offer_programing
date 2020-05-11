package part1_1_10;

import java.util.ArrayList;

/**
 * @author jacky
 * @time 2020-04-30 10:32
 * @discription 链表：
 *              输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 *
 *              Solution_1:
 *              采用递归并利用调用ListNode的next获取下一个值，将值递归传递下去
 *              然后利用val获取值，将值传递到数组当中，达到最深层后一层层往外输出内容
 *              也就是实现了从尾到头返回arrayList
 *
 *              Tips:
 *              ArrayList：   可调整大小的数组的实现List接口。
 *              实现所有可选列表操作，并允许所有元素，包括null 。
 *              除了实现List 接口之外，该类还提供了一些方法来操纵内部使用的存储列表的数组的大小。
 */

public class Question_3_method_1 {
    private ArrayList<Integer> arrayList = new ArrayList<>();
    private ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode != null)
        {
            this.printListFromTailToHead(listNode.next);
            arrayList.add(listNode.val);
        }
        return arrayList;
    }

    //题目已给出
    public class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val)
        {
            this.val = val;
        }
    }
}
