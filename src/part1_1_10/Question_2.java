package part1_1_10;

/**
 * @author jacky
 * @time 2020-04-29 23:20
 * @discription 字符串：
 *              请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 *              例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 *
 *              Solution:
 *              将Str转换为String类型之后，调用静态方法replaceAll即可
 *
 *              Tips:
 *              replaceAll(String regex, String replacement)：
 *                  用给定的替换替换与给定的regular expression匹配的此字符串的每个子字符串。
 *                  regex expression：正则表达式
 *              str.replaceAll == Pattern.compile(regex).matcher(this).replaceAll(replacement)
 */
public class Question_2 {
    public String replaceSpace(StringBuffer str) {
        /*
         *
         */

        return str.toString().replaceAll(" " , "%20");
    }
}
