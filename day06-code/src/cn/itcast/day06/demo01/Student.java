package cn.itcast.day06.demo01;

/**
 * 定义一个类, 用来模拟"学生"事物, 其中就有两个组成部分.
 *
 * 属性(是什么)
 *      姓名
 *      年龄
 *
 * 行为(能做什么)
 *      吃饭
 *      睡觉
 *      学习
 *对应到java的类单重
 *
 * 属性--成员变量
 *    String name;
 *    int age;
 * 行为--成员方法
 *      public void eat(){}  //吃饭
 *      public void sleep(){}   //睡觉
 *      public void study(){}   //学习
 *
 *
 * 注意事项
 * 1. 成员变量直接定义在类当中, 在方法外边.
 * 2. 成员方法不能加static
 *
 */

public class Student {
    //成员变量
    String name;
    int age;

    //成员方法
    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(){
        System.out.println("睡觉");
    }

    public void study(){
        System.out.println("打豆豆.");
    }


}
