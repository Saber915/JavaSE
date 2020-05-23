package cn.itcast.day07.demo02;

/**
 * 创建对象的标准格式:
 *  类名称 对象名= new 类名称();
 *
 *  匿名对象就是只有右边的对象, 没有左边的名字和赋值运算符.
 */
public class Demo01Anonymous {

    public static void main(String[] args) {
        Person one = new Person();
        one.name = "Saber";
        one.show();

        //匿名对象.
        new Person().show();
    }
}
