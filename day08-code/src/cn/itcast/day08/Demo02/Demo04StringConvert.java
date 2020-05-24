package cn.itcast.day08.Demo02;

/**
 * String 当中与转换相关的常用方法有:
 *
 * public char[] toCharArray()  将字符串拆分成字符数组最为返回值.
 * public byte[] getBytes()      获得当前字符串地城的字节数组.
 * public String replace(CharSequence olString, charSequence newString)
 * 将所有出现的老字符串替换成为新的字符串, 返回替换之后的结果新字符串.
 *
 * CharSequence意思就是说可以接受字符串.
 *
 * */
public class Demo04StringConvert {
    public static void main(String[] args) {
        //转成字符数组.
        char[] chars = "Hello".toCharArray();
        for (char c:chars) {
            System.out.println(c);
        }

        System.out.println("----------------");

        //转成字节数组.
        byte[] bytes = "abcd".getBytes();
        for (byte b:bytes) {
            System.out.println(b);
        }

        System.out.println("----------------");

        //replace
        String str1 = "How do you do?";
        String o = str1.replace("o", "*");
        System.out.println(o);
        System.out.println(str1);


    }
}
