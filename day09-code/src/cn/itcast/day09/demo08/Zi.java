package cn.itcast.day09.demo08;

/**
 * super关键字的用法有三种.
 * 1. 子类的成员方法中, 访问父类的成员变量.
 * 2. 子类的成员方法中, 访问父类的成员方法.
 * 3. 子类的构造方法中, 访问父类的构造方法.(默认, 显示调用两种方式.)
 *
 */
public class Zi extends Fu {
    int num = 20;

    public void methodZi(){
        System.out.println(super.num);
    }

    public void method(){
        super.method();
        System.out.println("子类方法");
    }
}
