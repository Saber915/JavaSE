package cn.itcast.day07.demo1;

import java.util.Scanner;

/**
 * 键盘输入三个数字, 求最大值.
 */
public class Demo03ScannerMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入第一个: ");
        int i = sc.nextInt();

        System.out.println("输入第二个: ");
        int i1 = sc.nextInt();

        System.out.println("输入第三个: ");
        int i2 = sc.nextInt();

        if (i > i1){
            if (i > i2){
                System.out.println("最大值: "+i);
            }else{
                System.out.println("最大值: "+ i2);
            }
        }else{
            if (i1 > i2){
                System.out.println("最大值: "+ i1);
            }else{
                System.out.println("最大值: "+ i2);
            }
        }
    }
}
