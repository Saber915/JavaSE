package cn.itcast.day08.Demo02;

/**
 * 字符串的截取方法:
 *
 * public String substring(int index)   从参数位置截取, 一直到字符串末尾.返回新的字符串
 * public String substring(int begin, int end) 截取从begin到end中间的字符串 [begin, end)
 *
 */
public class Demo03Substring {
    public static void main(String[] args) {
        String str1 = "Helloworld";
        String substring = str1.substring(6);
        System.out.println(substring);
        System.out.println(str1);

        String substring1 = str1.substring(4, 7);
        System.out.println(substring1);

        String strA = "Hello";
        System.out.println(strA);

        strA = "Java";
        System.out.println(strA);
    }
}
