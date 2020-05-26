package cn.itcast.day08.Demo02;

/**
 * ==是机型对象地址值比较, 如果确实需要字符串内容比较, 可以使用两个方法.
 *
 * public boolean equals(Object obj): 参数是任何对象, 只有参数是一个字符串并且内容下宫廷才会给True,否则返回false.
 *
 *
 * 注意事项:
 * 1. 任何对象都能用Object进行接收.
 * 2. equals方法具有对称性, 也就是a.equals(b) 和b.equals(a)效果一样.
 * 3. 如果比较双方一个常量,一个变量, 推荐把常量字符串写在前面
 *
 *
 * public boolean equalsIgnoreCase(String str)  //忽略大小写, 进行内容比较
 */
public class Demo01StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String(new char[]{'H', 'e', 'l', 'l', 'o'});

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str1.equals(str3));



        String strA = "Java";
        String strB = "java";
        System.out.println(strA.equals(strB));
        System.out.println(strA.equalsIgnoreCase(strB));
    }
}
