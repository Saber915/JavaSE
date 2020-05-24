package cn.itcast.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

/**
 * 生成6个1-33的随机数字, 添加到集合, 并遍历集合.
 */
public class Demo01ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            int i1 = random.nextInt(33) + 1;
            list.add(i1);
        }

        for (int i: list) {
            System.out.println(i);
        }
    }
}
