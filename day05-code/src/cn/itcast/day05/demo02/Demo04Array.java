package cn.itcast.day05.demo02;

/**
 * 数组遍历
 */
public class Demo04Array {
    public static void main(String[] args) {
        int[] array = {15, 25, 30, 50, 90};

        //首先使用原始方式
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println("---------------------");

        //for循环
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //for each
        for (int i: array) {
            System.out.println(i);
        }


    }
}
