package cn.itcast.day06.demo01;

/**
 * 通常情况下, 一个类并不能字节使用, 需要根据类创建一个对象, 才能使用.
 *
 * 1. 导包: 也就是之处需要使用的类, 在什么位置.
 *      import cn.itcast.day06.demo01.Student;
 * 对于和当前类属于同一个包的情况下, 可以省略导包语句不写.
 *
 * 2. 创建
 *      Student student = new Student();
 * 3. 使用
 *      使用成员变量:
 *          student.name;
 *          student.age;
 *      使用成员方法:
 *      student.eat([参数列表]);
 */
public class Demo02Student {
    public static void main(String[] args) {
        //创建对象.
        Student student = new Student();

        //使用成员变量
        System.out.println(student.name);
        System.out.println(student.age);
        student.name = "Saber";
        student.age = 18;
        System.out.println("----------------");
        System.out.println(student.name);
        System.out.println(student.age);

        System.out.println("----------------");
        ///成员方法
        student.eat();
        student.sleep();
        student.study();
    }
}
