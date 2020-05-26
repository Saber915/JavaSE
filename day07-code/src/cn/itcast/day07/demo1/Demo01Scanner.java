package cn.itcast.day07.demo1;

import java.util.Scanner;   //1. 导包

/**
 * Scanner 类的功能: 可以实现键盘输入数据, 到程序中.
 *
 * 引用类型的一般使用步骤:
 *
 * 1. 导包
 *  import java.lang.Scanner
 *  如果需要使用的目标类, 和当前类位于同一个包下, 则可以省略导包语句不写.
 *  只有java.lang包下的内容不需要导包, 其他的包都需要import语句.
 *
 * 2. 创建
 *  Scanner sc = new Scanner(System.in)
 *
 * 3. 使用
 * int i = sc.nextIn();
 *
 * 获取键盘输入的int数字.
 */
public class Demo01Scanner {
    public static void main(String[] args) {
        //2. 创建
        //System.in代表从键盘输入.
        Scanner sc = new Scanner(System.in);

        //3. 获取键盘输入的int数字.
        int i = sc.nextInt();
        System.out.println(i + 10);

        System.out.println("---------------");
        String next = sc.next();
        System.out.println(next);


    }

}
