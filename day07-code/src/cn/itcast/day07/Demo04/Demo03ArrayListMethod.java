package cn.itcast.day07.Demo04;

import java.util.ArrayList;

/**
 * ArrayList当中的常用方法
 * 1.
 *   public boolean add(E e)      //向集合中添加元素, 参数类型和泛型一致. 返回值->添加是否成功
 * 2.
 *   public E get(int index)    //从集合中获取元素, 参数是索引编号, 返回值就是对应位置的元素
 *
 * 3. public E remove(int index)    //从集合中删除元素, 参数是索引编号, 返回值就是被删除掉的元素
 *
 * 4.
 *      public int size()   //获取集合的长度, 返回值就是包含的元素个数.
 *
 */
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        System.out.println(list);

        //向集合中添加元素
        boolean saber = list.add("Saber");
        System.out.println(saber);
        System.out.println(list);

        list.add("Archer");
        list.add("Lancer");
        list.add("Barsaka");
        list.add("杨玉环");
        list.add("陈圆圆");
        System.out.println(list);

        //从集合中获取元素, get
        System.out.println(list.get(4));
        String s = list.get(5);

        //删除元素, remove
        String remove = list.remove(3);
        System.out.println(remove);
        System.out.println(list);

        System.out.println(list.size());

    }
}
