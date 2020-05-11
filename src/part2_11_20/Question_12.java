package part2_11_20;

/**
 * @author jacky
 * @time 2020-05-11 15:50
 * @discription 数值的整数次方 数学
 *              给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 *              保证base和exponent不同时为0
 */
public class Question_12 {
    public double Power(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    /**
     *下面的讨论中 x 代表 base，n 代表 exponent。
     * 因为 (x*x)n/2 可以通过递归求解，并且每次递归 n 都减小一半，因此整个算法的时间复杂度为 O(logN)。
     */
    public double Power_2(double base, int exponent) {
        if (exponent==0)
            return  1;
        if (exponent==1)
            return base;
        boolean isNegative = false;
        if (exponent<0){
            exponent = - exponent;
            isNegative = true;
        }
        double pow = Power_2(base*base, exponent/2);
        if (exponent % 2 != 0)
            pow = pow * base;
        return isNegative ? 1/pow:pow;
    }
}
