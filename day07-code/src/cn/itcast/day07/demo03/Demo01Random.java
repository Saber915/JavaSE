package cn.itcast.day07.demo03;

import java.util.Random;

/*
Random类用来生成随机数字, 使用起来也是三个步骤
1. 导包
import java.util.Random
2. 创建
Random ran = new Random()
3. 使用
    获取一个随机的int数字
    ran.nextInt();  int范围内的随机int.
    ran.nextInt(10);    10之类的随机数(左闭右开区间)[0, 10).
 */
public class Demo01Random {
    public static void main(String[] args) {
        Random ran = new Random();
        int i1 = ran.nextInt();
        System.out.println(i1);


        int i = ran.nextInt(10);
        System.out.println(i);
    }
}
