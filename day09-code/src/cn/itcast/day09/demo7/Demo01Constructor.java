package cn.itcast.day09.demo7;

/**
 * 继承关系中, 父子类构造方法的访问特点.
 *
 * 1. 子类构造方法当中有一个默认隐含的 "super()"调用父类构造方法.
 * 2. 可以通过super关键字调用
 * 3. super的父类构造调用, 必须是子类构造方法的第一个语句. 不能一个子类构造调用多次super构造.
 * 总结:
 *  子类必须调用父类构造方法, 不写则默认调用super(), 写了则用写的指定的super调用, super只能有一个, 还必须是第一个.
 */
public class Demo01Constructor {
    public static void main(String[] args) {
        Zi zi = new Zi();

    }
}
