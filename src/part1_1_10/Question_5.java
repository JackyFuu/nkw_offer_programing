package part1_1_10;

import java.util.Stack;

/**
 * @author jacky
 * @time 2020-04-30 13:25
 * @discription 队列&栈：
 *              用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 *
 *              Solution:
 *              根据栈和队列的特性，即可实现
 *              但是要注意，在取出模拟队列的队首元素之后，要将模拟队列归位，即使两个栈回到Pop操作之前的状态
 *
 *
 *              Tips:
 *              栈：后进先出
 *              队列：先进先出
 */
public class Question_5 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        //将stack1中的内容存入栈2中
        while(!stack1.isEmpty())
        {
            stack2.push(stack1.pop());
        }
        //从stack2中出来一个
        int out = stack2.pop();
        while(!stack2.isEmpty())
        {
            stack1.push(stack2.pop());
        }
        return out;
    }
}
