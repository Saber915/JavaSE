package cn.itcast.day08.demo01;

/**
 *字符串常量池: 程序当中直接写上的双引号字符串, 就在字符串常量池中.
 * new出来的字符串对象不在常量池中.
 *
 * 对于基本来兴来说 == 是进行 [数值] 的比较.
 * 对于引用类型来说 == 是进行 [地址值] 比较.
 */
public class Demo02StringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String(new char[]{'a', 'b', 'c'});

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str2 == str3);


    }
}
