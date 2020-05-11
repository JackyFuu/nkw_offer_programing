package part1_1_10;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author jacky
 * @time 2020-04-30 12:25
 * @discription 链表：
 *              输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 *
 *              Solution_2:可以采用栈，因为栈就是先进后出的，可以先把所有内容转到栈中，然后再依次转入到arrayList当中
 */
public class Question_3_method_2 {
    public ArrayList<Integer> printListFromTailToHead(Question_3_method_1.ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while(listNode != null){
            stack.add(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> result = new ArrayList<>();
        while (!stack.isEmpty()){
            //Removes the object at the top of this stack and returns that
            //object as the value of this function.
            result.add(stack.pop());
        }
        return result;
    }
}
