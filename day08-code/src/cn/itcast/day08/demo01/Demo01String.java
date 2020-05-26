package cn.itcast.day08.demo01;


/**
 * java.lang.String
 * API当中说: Java 程序中的所有字符串字面值（如 "abc" ）都作为此类的实例实现。
 * 其实就是说: 程序中所有的双引号字符串, 都是String类的对象(就算没有new, 也照样是.)
 *
 * 字符串特点.
 * 1. 字符串的内容永不可变  [重点]
 * 2. 正是因为字符串不可改变, 所以字符串是可以共享使用的.
 * 3. 字符串效果上相当于是char[] 字符数组, 但是底层远离是byte[] 字节数组.
 *
 * 创建字符串的常见3+1中方式
 * 1. public String();          创建一个空白字符串
 * 2. public String(char[] value)       根据字符数组的内容,来创建对应的字符串.
 * 3. public String(byte[] value)       根据字节数组的内容,来创建对应的字符串.
 * 4. 直接创建.
 *
 * 注意: 直接写上双引号, 就是字符串对象
 */
public class Demo01String {
    public static void main(String[] args) {
        //1. 使用空参构造
        String str1 = new String();
        System.out.println("第一个字符串是: " + str1);

        //2. 根据字符数组创建字符串.
        char[] charArray = {'A', 'B', 'C'};
        String str2 = new String(charArray);
        System.out.println("第二种方式:  "+ str2);

        //3. 根据字节数组的内容,来创建对应的字符串.
        byte[] byteArray = {97, 98, 99, 100};
        String str3 = new String(byteArray);
        System.out.println("第三种方式:  "+ str3);

        //4. 直接创建
        String str4 = "saber";
        System.out.println("第四种方式:  "+ str4);
    }
}
