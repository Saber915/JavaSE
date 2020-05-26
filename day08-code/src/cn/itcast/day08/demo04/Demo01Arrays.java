package cn.itcast.day08.demo04;

import java.util.Arrays;

/**
 * java.util.Arrays是一个与数组相关的工具类, 里面提示了大量静态方法, 用来实现数组常见的操作.
 *
 * public static String toString(array): 将参数数组变成字符串按默认的格式([元素1, 元素2, 元素3.])
 * public static void sort(数组): 按照默认升序对数组进行排序.(原地排序)
 * 1. 如果是数字 按大小排
 * 2. 如果是字母, 按字母升序
 * 3. 如果是自定义类型, 那么需要有Comparable或者Comparator接口支持.
 */
public class Demo01Arrays {
    public static void main(String[] args) {
        int[] intArray = {10, 20, 30};
        String string = Arrays.toString(intArray);
        System.out.println(string);

        int[] array1 = {2, 1, 3, 10, 6};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));


        String[] array2 = {"bbb", "aaa", "ccc"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
    }
}
