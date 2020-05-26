package cn.itcast.day07.demo02;

import java.util.Scanner;

public class Demo02Anonymous {
    public static void main(String[] args) {
        //普通方式
//        Scanner sc = new Scanner(System.in);
//
//        int i = sc.nextInt();


        //匿名对象使用方式

//        int number = new Scanner(System.in).nextInt();
//        System.out.println(number);

        //匿名对象传参
//        methodParam(new Scanner(System.in));

        //匿名对象作为返回值.
        Scanner scanner = methodReturn();
        int i = scanner.nextInt();
        System.out.println("输入的是: " + i);
    }

    public static void methodParam(Scanner sc){
        int i = sc.nextInt();
        System.out.println("输入的是: "+ i);
    }

    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }
}
