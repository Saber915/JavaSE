package cn.itcast.day07.demo03;

import java.util.Random;
import java.util.Scanner;

public class Demo04Random {
    public static void main(String[] args) {
        Random ran = new Random();
        int i = ran.nextInt(100) + 1;
//        System.out.println(i);
        Scanner sc = new Scanner(System.in);

//        while (guess != i){
//            if (guess > i){
//                System.out.println("猜大了");
//                System.out.println("重新猜吧: ");
//                guess = sc.nextInt();
//            }else if (guess < i){
//                System.out.println("猜小了");
//                System.out.println("重新猜吧: ");
//                guess = sc.nextInt();
//            }
//        }
        //while 无限循环
//        while (true){
//            System.out.println("来猜数吧: ");
//            int guess = sc.nextInt();
//            if (guess > i){
//                System.out.println("猜大了, 请重试");
//            }else if (guess < i){
//                System.out.println("猜小了, 请重试");
//            }else{
//                System.out.println("bingo, 猜对了");
//                break;
//            }
//        }
//        System.out.println("游戏结束.");

        for (int i1 = 0; i1 < 5; i1++) {
            System.out.println("来猜数吧: ");
            int guess = sc.nextInt();
            if (guess > i) {
                System.out.println("猜大了, 请重试");
            } else if (guess < i) {
                System.out.println("猜小了, 请重试");
            } else {
                System.out.println("bingo, 猜对了");
                break;
            }
        }
    }
}
