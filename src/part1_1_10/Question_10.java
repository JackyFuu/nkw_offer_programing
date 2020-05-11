package part1_1_10;

import java.util.Scanner;

/**
 * @author jacky
 * @time 2020-05-05 14:43
 * @discription 矩形覆盖 递归
 *              我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 *              请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 *              比如n=3时，2*3的矩形块有3种覆盖方法：
 *
 *              Solution:
 *              当n=1 只有一种覆盖方法
 *              当n=2 有两种覆盖方法
 *
 *              要覆盖 2*n 的大矩形，可以先覆盖 2*1 的矩形，再覆盖 2*(n-1) 的矩形；
 *              或者先覆盖 2*2 的矩形，再覆盖 2*(n-2) 的矩形。
 *              而覆盖 2*(n-1) 和 2*(n-2) 的矩形可以看成子问题。该问题的递推公式如下：
 *              n=1 f(n)=1
 *              n=2 f(n)=2
 *              n>1 f(n)=f(n-1)+f(n-2)
 */
public class Question_10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        int result = RectCover(target);
        System.out.println(result);
    }

    private static int RectCover(int target){
        if (target<=2)
            return target;
        int pre2 = 1, pre1 = 2;
        int result = 0;
        for (int i = 3; i<=target; i++){
            result = pre1 + pre2;
            pre2 = pre1;
            pre1 = result;
        }
        return  result;
    }
}
