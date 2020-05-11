package part1_1_10;

/**
 * @author jacky
 * @time 2020-05-05 13:17
 * @discription 递归
 *              大家都知道斐波那契数列，现在要求输入一个整数n，
 *              请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。n<=39
 *
 *              Tips:
 *              Fibonacci function:
 *              f(n): n=0   f(n)=0
 *                    n=1   f(n)=1
 *                    n>1   f(n)=f(n-1)+f(n-2)
 *
 *              Solution:
 *              使用递归求解，会重复计算一些子问题
 *              递归是将一个问题划分成多个子问题求解，动态规划也是如此，
 *              但动态规划会把子问题的解缓存起来，从而避免重复求解子问题
 */
public class Question_7 {
    public int Fibonacci(int n) {
        //运行时间：13ms  占用内存：9292k
        if (n<=1)
            return n;
        int[] fib = new int[n+1];
        fib[1] = 1;
        for (int i=2; i<=n; i++)
            fib[i] = fib[i-1] +fib[i-2];
        return fib[n];
    }

    //考虑到第 i 项只与第 i-1 和第 i-2 项有关，
    // 因此只需要存储前两项的值就能求解第 i 项，从而将空间复杂度由 O(N) 降低为 O(1)。
    public int Fibonacci_1(int n) {
        //运行时间：13ms  占用内存：9264k
        if (n<=1)
            return n;
        int pre2 =0, pre1=1;
        int fib =0;
        for (int i=2; i<=n; i++){
            fib = pre2 + pre1;
            pre2 = pre1;
            pre1 = fib;
        }
        return fib;
    }

    /*
     * 由于待求解的 n 小于 40，因此可以将前 40 项的结果先进行计算，之后就能以 O(1) 时间复杂度得到第 n 项的值。
     * 该方法通过构造函数将前40项的结果计算出来并存储到fib数组中
     */

//    private int[] fib = new int[40];
//
//    public Solution() {
//        fib[1] = 1;
//        for (int i = 2; i < fib.length; i++)
//            fib[i] = fib[i - 1] + fib[i - 2];
//    }
//
//    public int Fibonacci_2(int n) {
//        return fib[n];
//    }
}
