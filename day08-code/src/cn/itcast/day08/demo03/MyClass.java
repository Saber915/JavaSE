package cn.itcast.day08.demo03;

public class MyClass {
    int num;
    static int numStatic;

    //成员方法
    public void method(){
        System.out.println("这是一个成员方法");
        //成员方法可以访问成员变量
        System.out.println(num);
        //成员方法可以访问静态变量
        System.out.println(numStatic);
    }

    //静态方法.
    public static void methodStatic(){
        System.out.println("这是一个静态方法.");
        //静态方法可以访问静态变量
        System.out.println(numStatic);
        //静态方法不能访问非静态变量
//        System.out.println(num);  //错误写法.
    }
}
