package part2_11_20;

import java.util.Scanner;

/**
 * @author jacky
 * @time 2020-05-06 16:37
 * @discription 二进制中1的个数    进制转化、补码反码原码
 *              输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class Question_11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println(Numberof1_2(x));
    }
    //方法1
    private static int Numberof1_1(int n){
        return Integer.bitCount(n);
    }
    //方法2
    //n&(n-1):该位运算去除 n 的位级表示中最低的那一位。
    private static int Numberof1_2(int n){
        int cnt = 0;
        while(n!=0){
            cnt++;
            n = n & (n-1);
        }
        return cnt;
    }
}
