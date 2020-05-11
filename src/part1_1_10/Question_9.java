package part1_1_10;

/**
 * @author jacky
 * @time 2020-05-05 14:06
 * @discription 变态跳台阶 贪心
 *              一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 *              求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class Question_9 {

    public static void main(String[] args) {
        int target = 6;
        JumpFloorII(target);
    }

    /**
     * 非递归方法
     * @param target
     * @return
     */
    private static int JumpFloorII(int target) {
        /*
        数学推导方式：
        跳上 n-1 级台阶，可以从 n-2 级跳 1 级上去，也可以从 n-3 级跳 2 级上去...，那么
            f(n-1) = f(n-2) + f(n-3) + ... + f(0)
        同样，跳上 n 级台阶，可以从 n-1 级跳 1 级上去，也可以从 n-2 级跳 2 级上去... ，那么
            f(n) = f(n-1) + f(n-2) + ... + f(0)
        综上可得
            f(n) - f(n-1) = f(n-1)
        即
            f(n) = 2*f(n-1)
        所以 f(n) 是一个等比数列
         */
        return (int) Math.pow(2, target - 1); // pow(a,b)：a的b次幂
    }

    /**
     *  递归方法
     * @param target
     * @return
     */

    private static int JumpFloorII_2(int target) {
        if (target == 1)
            return 1;
        else
            return 2 * JumpFloorII_2(target-1);
    }
}
