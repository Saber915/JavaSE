package cn.itcast.day08.Demo02;

/**
 * String 当中与获取相关的常用方法
 *
 * public int length()      //获取字符串长度.
 * public String concat(String str) 将当前字符串和参数字符串拼接成为返回值, 新的字符串
 * public char charAt(int index)    获取指定位置的单个字符(索引从0开始)
 * public int indexOf(String str)   查找参数字符串在本字符串中首次出现的索引位置, 如果没有返回-1
 */
public class Demo02StringGet {

    public static void main(String[] args) {
        // length()
        int length = "abcdefghijklmnopqrstuvwxy.".length();
        System.out.println("字符串长度: " + length);

        //concat
        String str1 ="Hello";
        String str2 = " World";
        String str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println("================");

        //charAt
        char c = "Hello".charAt(1);
        System.out.println("在一号索引位置的索引是: "+c);

        //indexOf

        String original = "HelloWorldHelloWorld";
        int i = original.indexOf("llox");
        System.out.println("llox所在位置为: " + i);

    }
}
