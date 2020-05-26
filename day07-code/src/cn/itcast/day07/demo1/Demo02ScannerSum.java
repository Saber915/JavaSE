package cn.itcast.day07.demo1;

import java.util.Scanner;

/**
 * 键盘输入两个数字, 求和
 */
public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字: ");
        int i = sc.nextInt();
        System.out.println("请输入第二个数字: ");
        int i2 = sc.nextInt();
        System.out.println("和为: " + (i +  i2));

    }
}
