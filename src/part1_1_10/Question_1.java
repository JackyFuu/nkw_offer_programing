package part1_1_10;

/**
 * @author jacky
 * @time 2020-04-29 23:08
 * @discription 二维数组中的查找：
 *              在一个二维数组中（每个一维数组的长度相同），
 *              每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 *              请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 *              Via：https://blog.csdn.net/qq_41901915/article/details/90082787
 *
 *              Solution：
 *              根据数组的特点可以发现,如果从左下角开始查找更为方便
 *              左下角的数比同一列的数大，同时比同一行的数小
 *              也就是从左下角开始比，如果target传入的数大于它则列数加一继续比较
 *              如果小于它则行数减一继续比较
 *
 *              Tips:
 *              Array类提供静态方法来动态创建和访问Java数组。
 *              Arrays类包含用于操作数组的各种方法（如排序和搜索）。 该类还包含一个静态工厂，可以将数组视为列表。
 */
public class Question_1 {
    public boolean Find(int target, int [][] array){


        //定义行数
        int rows=array.length;
        //定义列数
        int lies=array[0].length;
        //定义i用来计数
        int i=0;
        //while里的条件是极限情况，不满足条件的时候则停止
        while((rows>0)&&(i<lies))
        {
            //目标大于左下角，让列数自增
            if(target>array[rows-1][i])
            {
                i++;
                //目标小于左下角，让行数自减
            }else if(target<array[rows-1][i])
            {
                rows--;
            }else
            {
                //除了上述两种情况就是相等了，说明已经找到了
                return true;
            }
        }
        //遍历完还没有找到，说明不存在
        return false;
    }
}
