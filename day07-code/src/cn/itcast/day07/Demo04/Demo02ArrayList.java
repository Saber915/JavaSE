package cn.itcast.day07.Demo04;

import java.util.ArrayList;

/**
 * 数组的长度不可以发生改变.
 * 但是ArrayList集合的长度是可以随意改变的.
 *
 * 对于ArrayList来说, 有一个建口号<E>代表泛型.
 * 泛型, 也就是装在集合当中的所有元素, 全都是统一的什么类型.
 * 注意, 泛型只能是引用类型, 不能是基本类型.
 */
public class Demo02ArrayList {
    public static void main(String[] args) {
        //创建一个ArrayList, 集合的名称是list, 里面装的全都是String字符串类型的数据.
        //备注, 从JDK1.7开始右侧的尖括号内部可以不写内容, 但括号本身必须写.

        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        //向集合当中添加一些数据, 使用add方法.
        list.add("Saber");
        list.add("Archer");
        list.add("Barsaka");
        System.out.println(list);
    }

}
