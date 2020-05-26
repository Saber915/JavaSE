package cn.itcast.day07.demo05;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Random;

/**
 * 用一个大集合存入20个随机数字, 筛选其中的偶数元素, 放到小集合中.
 */
public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(100));
        }

        ArrayList<Integer> integers = filterOdd(list);
        System.out.println(integers);
        System.out.println(integers.size());


    }

    private static ArrayList<Integer> filterOdd(ArrayList<Integer> list){
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i: list) {
            if (i % 2 == 0){
                list2.add(i);
            }
        }
        return list2;
    }


}
