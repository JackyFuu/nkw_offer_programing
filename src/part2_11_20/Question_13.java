package part2_11_20;

/**
 * @author jacky
 * @time 2020-05-11 16:40
 * @discription 调整数组顺序使奇数位于偶数前面 数组
 *              输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 *              使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 *              并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class Question_13 {
    //方法一：创建一个新数组，时间复杂度 O(N)，空间复杂度 O(N)。
    public void reOrderArray(int [] array) {
        int oddCnt = 0;
        for (int x : array)
            if (x%2!=0)
                oddCnt++;
        int[] copy = array.clone(); //创建并返回对象的副本
        int i=0,j=oddCnt;
        for (int num : copy){
            if (num%2==1)
                array[i++]=num;
            else
                array[j++]=num;
        }
    }

    //方法二：使用冒泡思想，每次都将当前偶数上浮到当前最右边。时间复杂度 O(N2)，空间复杂度 O(1)，时间换空间。
    public void reOrderArray_1(int [] array) {
        int N = array.length;
        for (int i = N-1; i>0; i--){
            for (int j=0; j<i; j++){
                if (array[j]%2!=0 && array[j+1]%2==0) //j为奇数，J+1为偶数
                {
                    swap(array,j,j+1);
                }
            }
        }
    }
    private void swap(int[] array, int i, int j){
        int t = array[i];
        array[i]=array[j];
        array[j]=t;
    }
}
