package part1_1_10;

/**
 * @author jacky
 * @time 2020-05-05 13:42
 * @discription 递归(类似于Fibonacci)
 *              一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 *              求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 *
 *              Solution:
 *              当n=1，只有一种跳法
 *              当n=2，有两种跳法，一是一阶一阶跳，二是直接跳二阶
 *
 *              跳 n 阶台阶，可以先跳 1 阶台阶，再跳 n-1 阶台阶；或者先跳 2 阶台阶，再跳 n-2 阶台阶。
 *              而 n-1 和 n-2 阶台阶的跳法可以看成子问题，该问题的递推公式为：
 *              f(n):
 *                  n=1 1
 *                  n=2 2
 *                  n>1 f(n-1) + f(n-2)
 */
public class Question_8 {
    public int JumpFloor(int target) {
        if (target<=2)
            return target;
        int pre2= 1, pre1 =2;
        int result=0;
        for (int i=2; i<target; i++){
            result = pre2 + pre1;
            pre2 = pre1;
            pre1 = result;
        }
        return result;
    }
}
